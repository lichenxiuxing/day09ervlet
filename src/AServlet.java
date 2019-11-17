import javax.servlet.*;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/17
 * 11:45
 */
public class AServlet implements Servlet {
    /*
    生命周期方法（由tomcat来进行调用）
    servlet的初始化，仅仅调用一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("这是init...");
        System.out.println(servletConfig.getServletName());
        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));

    }
    /*
    用来获取servlet的配置信息
    由tomcat传入service的参数来获取
     */
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("这是getServletConfig...");
        return null;
    }
    /*
    声明周期方法
    被调用多次
     */
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("这是servlet...");
    }
    /*
    获取servlet的基本信息
    一般无用
     */
    @Override
    public String getServletInfo() {
        System.out.println("这是getServletInfo...");
        return null;
    }
    /*
    生命周期方法
    在servlet毁灭之前被调用
    用来释放非内存资源等
     */
    @Override
    public void destroy() {
        System.out.println("这是destroy...");

    }
}
