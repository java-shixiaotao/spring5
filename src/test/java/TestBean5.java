import com.mouds.autowire.Emp;
import com.mouds.beanLife.BeanLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean5 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        //2.获取配置的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

}
