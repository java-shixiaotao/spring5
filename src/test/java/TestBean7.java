import com.mouds.service.ComponentService;
import com.mouds.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean7 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        //2.获取配置的对象
        OrderService orderService = context.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        orderService.add();
    }

}
