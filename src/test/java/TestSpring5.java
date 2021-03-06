import com.mouds.beanList.Coures;
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
    public void testBook1(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置的对象
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book1);
    }


    @Test
    public void testOrder(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置的对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order.toString());
    }


    @Test
    public void factoryBeanTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2.获取配置的对象
        Coures coures = context.getBean("factoryBeanDemo", Coures.class);
        System.out.println(coures.toString());
    }
}
