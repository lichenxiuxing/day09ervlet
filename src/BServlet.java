import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/17
 * 13:24
 */
public class BServlet extends GenericServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("这是一个自定义的init方法");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("这是一个生命周期方法");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet即将被销毁");
    }
}
