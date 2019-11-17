import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/17
 * 13:35
 */
public class CServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext application=this.getServletContext();
        String s=application.getInitParameter("name");
        System.out.println(s);
    }
}
