import com.zhu.pojo.Student;
import com.zhu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2",User.class);
        User user2 = (User) context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user == user2);
        /*
       Student{
            name='syu ennsei',
            address=Address{address='kanagawa'},
            books=[honnda, nakayama, suzuki],
            hobbys=[music, cold, movie],
            card={
                id=1232222222,
                bank card=11233554613},
            games=[LOL, Dota, COC],
            wife='null',
            info={
                name=syu,
                gender=man,
                student id=MH030020,
                pass=123456
                }
         }

         */
    }
}