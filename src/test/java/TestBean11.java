import com.mouds.config.SpringConfig;
import com.mouds.jdbctemplate.FaceService;
import com.mouds.jdbctemplate.Users;
import com.mouds.transactional.AccountDao;
import com.mouds.transactional.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestBean11 {



    @Test
    public void getUsers(){
        //1.加载spring的配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //2.获取配置的对象
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.handleSal();
        System.out.println(accountService);
        //int ss = faceService.insertUsers(new Users(5, "史", "11111", "111@123.com", LocalDateTime.now()));

    }


}
