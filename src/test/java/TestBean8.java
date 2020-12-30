import com.mouds.config.SpringConfig;
import com.mouds.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean8 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //2.获取配置的对象
        OrderService orderService = context.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        orderService.add();
    }

}
