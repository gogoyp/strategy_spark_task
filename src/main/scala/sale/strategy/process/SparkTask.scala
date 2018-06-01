package sale.strategy.process

import java.util.Date

import sale.strategy.job.service.GenStrategy
import org.apache.commons.lang.time.DateFormatUtils
import org.apache.spark.SparkContext
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.stereotype.{Component, Service}
import org.apache.hadoop.fs.{FileStatus, FileSystem, FileUtil, Path}
import sale.strategy.job.service.GenStrategy
import sale.strategy.job.spark.util.ServiceUtils

import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer

/**
  * @author : yinpeng
  *         :spark任务类
  *         : 18/5/11
  */

@Service("sparkTask")
class SparkTask extends Task {

  private val LOGGER = LoggerFactory.getLogger(classOf[SparkTask])

  @Autowired
  @transient
  var sparkContext: SparkContext = _

  @Autowired
  var env: Environment = _


  override def doTask(): Unit = {
    LOGGER.info("scala  SparkTask start")
    //获取目录
    val hdfs = FileSystem.get(
      new java.net.URI(env.getProperty("hdfs.url")), new org.apache.hadoop.conf.Configuration())
    val fs = hdfs.listStatus(new Path(env.getProperty("hdfs.dstPath")))
    val listPath = FileUtil.stat2Paths(fs)
    val loadLimit = env.getProperty("load.limit")
    for (l <- listPath) {
      val pathStr = l.toString
      val fileName =l.getName
      val rdd = sparkContext.textFile(pathStr)
      rdd.foreachPartition(partiton => {

        val applicationContext = ServiceUtils.getContext
        val genService = applicationContext.getBean("genStrategy", classOf[GenStrategy])
        val list = new ArrayBuffer[String]

        partiton.foreach(line => {

          genService.genStrategy(line,fileName)
          list += line
          if (list.size >= loadLimit.toLong) {
            val jList: java.util.List[String] = list
            genService.genUserStrategy(jList, fileName);
            list.clear();
          }
         // println(line)
        })

        if (list.size > 0) {
          val jList: java.util.List[String] = list
          genService.genUserStrategy(jList, fileName);
        }

      })

      mvFile(hdfs, l)
      LOGGER.info("file " + l.getName + " finish")
    }
    hdfs.close()
    LOGGER.info("scala  SparkTask  stop")
  }



  def mvFile(hdfs: FileSystem, srcPath: Path): Unit = {
    val fileNamePrefix = DateFormatUtils.format(new Date, "yyyyMMdd")
    val dstb = new StringBuilder;
    dstb.append(env.getProperty("hdfs.backPath")).append("/").append(fileNamePrefix)
    val dstPath = new Path(dstb.toString)
    if (!hdfs.exists(dstPath)) {
      hdfs.mkdirs(dstPath)
    }
    dstb.append("/").append(srcPath.getName)
    hdfs.rename(srcPath, new Path(dstb.toString))
  }


}
