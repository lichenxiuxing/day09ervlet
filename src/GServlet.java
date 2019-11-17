import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/17
 * 15:49
 * 访问量统计
 */
@WebServlet(name = "GServlet")
public class GServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = this.getServletContext();
        //此方法可以给对象任意增加属性
        Integer count = (Integer) application.getAttribute("count");
        if (count == null) {
            application.setAttribute("count", 1);
        } else {
            application.setAttribute("count",count+1);
        }
        PrintWriter printWriter = response.getWriter();
        printWriter.print((Integer)application.getAttribute("count"));
    }
}
