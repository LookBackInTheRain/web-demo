package club.yuit.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author yuit
 * @date 2019/4/15 16:31
 */
/*@WebFilter(
        filterName = "mainFilter",
        urlPatterns = "/",
       dispatcherTypes =
               {DispatcherType.REQUEST,DispatcherType.ASYNC,DispatcherType.ERROR,DispatcherType.FORWARD,DispatcherType.INCLUDE}
)*/
public class MainFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("doFilter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
