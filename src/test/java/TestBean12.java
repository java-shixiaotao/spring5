import com.mouds.spring5NewFeature.Apple;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

public class TestBean12 {



    @Test
    public void getUsers(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2.将context刷新你
        context.refresh();
        context.registerBean("apple", Apple.class, Apple::new);
        //3,获取注册的对象
        Apple apple = (Apple)context.getBean("apple");
        //2.获取配置的对象
        System.out.println(apple);
        //int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));

    }


}
