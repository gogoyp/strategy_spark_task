# 主要是scala和java混合调用
  启动类 SparkApplication 分别启动spring容器和scala写的spark任务
  spark任务中调用获得springcontext调用java写的service
  
  底层service依
  赖的包是私有的，所以service的业务方法已经注释掉了