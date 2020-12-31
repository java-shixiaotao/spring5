import com.mouds.aopannotation.User;
import com.mouds.aopxml.Book;
import com.mouds.config.SpringConfig;
import com.mouds.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBean9 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
        //2.获取配置的对象
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void beanLifeCycleConfigTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //2.获取配置的对象
        User user = context.getBean("user", User.class);
        user.add();
    }


    @Test
    public void beanLifeCycleXmlest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        //2.获取配置的对象
        Book book = context.getBean("book", Book.class);
        book.add();
    }
}
