package sale.strategy.job.spark.util;


import sale.strategy.job.spark.SparkApplication;
import sale.strategy.job.spark.SparkApplicationContext;
import org.springframework.context.ApplicationContext;


public class ServiceUtils {

    private static final String SPARK_CONTEXT_BEAN_NAME = "genStrategy";

    //解决spark worker spring上下文没有加载问题
    static {
        if (SparkApplicationContext.getApplicationContext() == null
                || SparkApplicationContext.getApplicationContext().getBean(SPARK_CONTEXT_BEAN_NAME) == null) {
            SparkApplication.startSpring(new String[]{});
        }
    }

    /**
     * 获取context
     *
     * @param
     * @return
     */
    public static ApplicationContext getContext() {
        return SparkApplicationContext.getApplicationContext();
    }
}
