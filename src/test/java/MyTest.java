import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookSer = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookSer.queryAllBook()) {
            System.out.println(books);
        }

    }
}
