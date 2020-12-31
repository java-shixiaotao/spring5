import com.mouds.aopannotation.User;
import com.mouds.aopxml.Book;
import com.mouds.config.SpringConfig;
import com.mouds.jdbctemplate.FaceService;
import com.mouds.jdbctemplate.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

public class TestBean10 {

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        //2.获取配置的对象
        FaceService faceService = context.getBean("faceService", FaceService.class);
        int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));
        System.out.println(ss);
        }

}
