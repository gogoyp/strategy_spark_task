package sale.strategy.config

import org.springframework.core.env.Environment
import org.apache.spark.{SparkConf, SparkContext}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.{Bean, Configuration}

/**
  *
  * @author yinpeng
  * @version 0.0.1
  */
@Configuration
class SparkConfiguration {

  @Autowired
  var env : Environment  = _

  @Bean
  def sparkContext(): SparkContext = {
    val conf = new SparkConf().setAppName(env.getProperty("spark.appName"))
    conf.set("spark.master", env.getProperty("spark.master"))
    conf.set("spark.driver.memory", env.getProperty("spark.driver.memory", "512m"))
    conf.set("spark.driver.cores", env.getProperty("spark.driver.cores", "1"))
    conf.set("spark.executor.memory", env.getProperty("spark.executor.memory", "512m"))
    conf.set("spark.executor.cores", env.getProperty("spark.executor.cores", "1"))
    val sc = new SparkContext(conf)
    sc
  }

}
