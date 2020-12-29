import com.mouds.beanList.BeanListDemo;
import com.mouds.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean3 {

    @Test
    public void test(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置的对象
        BeanListDemo beanListDemo = context.getBean("beanListDemo", BeanListDemo.class);
        System.out.println(beanListDemo.toString());
    }

}
