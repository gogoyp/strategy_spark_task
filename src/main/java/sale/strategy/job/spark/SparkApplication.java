package sale.strategy.job.spark;

import sale.strategy.process.SparkTask;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"sale"})
public class SparkApplication
{
    public static void main(String[] args)
    {
        int argsLength=args.length;
        if (argsLength<1)
        {
            System.out.println("master不能为空");
            System.exit(-1);
        }
        else
        {
            System.setProperty("spark.master",args[0]);
            if (argsLength>1)
            {
                System.setProperty("spark.driver.memory",args[1]);
            }
            if (argsLength>2)
            {
                System.setProperty("spark.driver.cores",args[2]);
            }
            if (argsLength>3)
            {
                System.setProperty("spark.executor.memory",args[3]);
            }
            if (argsLength>4)
            {
                System.setProperty("spark.executor.cores",args[4]);
            }
        }
        startSpring(args);
        startSpark();
    }

    public static void startSpring(String[] args)
    {
        SpringApplicationBuilder springApplicationBuilder=new SpringApplicationBuilder(SparkApplication.class);
        springApplicationBuilder.web(false).run(args);
    }

    public static void startSpark()
    {
        ApplicationContext applicationContext= SparkApplicationContext.getApplicationContext();
        //String[] beans = applicationContext.getBeanDefinitionNames();
        ((SparkTask)applicationContext.getBean("sparkTask")).doTask();
    }


}
