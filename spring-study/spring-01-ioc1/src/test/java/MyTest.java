import com.zhu.dao.UserDaoMysqlImpl;
import com.zhu.service.UserService;
import com.zhu.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        //ユーザーが呼び出したのはservice，daoに触れない
        UserService userService = new UserServiceImpl();

        //制御の反転　ioc　　newあとのコードを書き換えることで、機能が変わる
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());

        userService.getUser();
    }
}
