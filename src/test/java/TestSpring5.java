import com.mouds.utils.Book;
import com.mouds.utils.Order;
import com.mouds.utils.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void test(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置的对象
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testBook(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置的对象
        Book book = context.getBean("book", Book.class);
        book.book111();
    }


    @Test
    public void testOrder(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置的对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order.toString());
    }
}
