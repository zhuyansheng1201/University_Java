import com.zhu.pojo.User;
import com.zhu.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*
        //Springコンテナ
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        user.show();
        //IOC　オブジェクトを作成するには デフォルトコンストラクタ！or 1.index 2.type 3.parameters

        System.out.println("----------");
        System.out.println(user == user2);
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("uu2");
        user.show();
    }
}
