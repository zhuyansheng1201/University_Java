import com.zhu.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest_2 {
    public static void main(String[] args) {

        // ApplicationContext; コンテナーを取得
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

       userServiceImpl.getUser();
    }
}
