import com.mouds.jdbctemplate.FaceService;
import com.mouds.jdbctemplate.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestBean10 {
    @Autowired
    private FaceService faceService;

    @Test
    public void beanLifeCycleTest(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        //2.获取配置的对象
        FaceService faceService = context.getBean("faceService", FaceService.class);
        int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));
        System.out.println(ss);
        }

    @Test
    public void getCount(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        //2.获取配置的对象
        FaceService faceService = context.getBean("faceService", FaceService.class);
        int count = faceService.getCount();
        //int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));
        System.out.println(count);
    }

    @Test
    public void batchInsert(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        //2.获取配置的对象
        FaceService faceService = context.getBean("faceService", FaceService.class);
        Object[] objects1 = {"1","李","1111","1111@qq.com",LocalDateTime.now()};
        Object[] objects2 = {"2","李","2222","2222@qq.com",LocalDateTime.now()};
        Object[] objects3 = {"3","李","3333","3333@qq.com",LocalDateTime.now()};
        List<Object[]> list = new ArrayList<>();
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        int[] ints = faceService.batchInsert(list);
        //int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));
        System.out.println(ints);
    }

    @Test
    public void getUsers(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        //2.获取配置的对象
        FaceService faceService = context.getBean("faceService", FaceService.class);
        Users users = faceService.getUsers(1);
        //int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));
        System.out.println(users);
    }


}
