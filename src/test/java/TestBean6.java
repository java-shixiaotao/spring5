import com.mouds.autowire.Emp;
import com.mouds.service.ComponentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean6 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        //2.获取配置的对象
        ComponentService componentService = context.getBean("componentService", ComponentService.class);
        System.out.println(componentService);
        componentService.add();
    }

}
