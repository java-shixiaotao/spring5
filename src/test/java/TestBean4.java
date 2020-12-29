import com.mouds.beanLife.BeanLifeCycle;
import com.mouds.beanList.Coures;
import com.mouds.utils.Book;
import com.mouds.utils.Order;
import com.mouds.utils.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean4 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        //2.获取配置的对象
        BeanLifeCycle beanLifeCycle = context.getBean("beanLifeCycle", BeanLifeCycle.class);
        System.out.println("第六步，使用ban对象");
        beanLifeCycle.toString();
        context.destroy();
    }

}
