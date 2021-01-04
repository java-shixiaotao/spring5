import com.mouds.jdbctemplate.FaceService;
import com.mouds.jdbctemplate.Users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDateTime;



@SpringJUnitConfig(locations = "classpath:bean7.xml")
public class TestBean13 {
    @Autowired
    private FaceService faceService;

    @Test
    public void beanLifeCycleTest(){
/*        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        //2.获取配置的对象
        FaceService faceService = context.getBean("faceService", FaceService.class);*/
        int ss = faceService.insertUsers(new Users(6, "贺", "6666", "666@123.com", LocalDateTime.now()));
        System.out.println(ss);
        }







}
