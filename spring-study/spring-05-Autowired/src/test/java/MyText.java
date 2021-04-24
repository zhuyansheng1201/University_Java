import com.zhu.popj.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_another.xml");

        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}
