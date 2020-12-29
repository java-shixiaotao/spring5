import com.mouds.service.UserService;
import com.mouds.utils.Book;
import com.mouds.utils.Order;
import com.mouds.utils.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {

    @Test
    public void test(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
