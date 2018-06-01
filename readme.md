# 程序的功能spark处理hdsf中的文件
  启动类 SparkApplication 分别启动spring容器和scala写的spark任务,spark任务中调用获得springcontext调用java写的service
  
  底层service依
  赖的包是私有的，所以service的业务方法已经注释掉了
  
  功能比较简单提交主要是记录下，java和scala的相互调用和在spark任务中使用spring