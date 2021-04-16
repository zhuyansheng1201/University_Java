import com.zhu.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // コンテキストオブジェクトを取得する
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 私のオブジェクトはSpringで管理されている
        Hello hello= (Hello) context.getBean("Hello");
        System.out.println(hello.toString());
    }
}
