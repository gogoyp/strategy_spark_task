package sale.strategy.job.spark;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SparkApplicationContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public SparkApplicationContext() {
    }

    @Override
     public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SparkApplicationContext.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
