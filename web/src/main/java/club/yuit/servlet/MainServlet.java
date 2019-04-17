package club.yuit.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author yuit
 * @date 2019/4/15 11:30
 */
@WebServlet(name = "mainServlet", value = "/main")
@ServletSecurity(
        value = @HttpConstraint(
                value = ServletSecurity.EmptyRoleSemantic.PERMIT,
                transportGuarantee = ServletSecurity.TransportGuarantee.NONE,
                rolesAllowed = {"ROLE_ADMIN"}
        ),
        httpMethodConstraints = {
                @HttpMethodConstraint(value = "POST"),
                @HttpMethodConstraint(value = "GET"),
                @HttpMethodConstraint(value = "PUT"),
                @HttpMethodConstraint(value = "DELETE")
        }
)
public class MainServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(MainServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("{index}");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("MainServlet-->service()");
        super.service(req, resp);

    }


    @Override
    public void destroy() {
        super.destroy();
        logger.info("MainServlet-->destroy()");
    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        System.out.println(context.getInitParameter("log4jConfigLocation"));
        logger.info("MainServlet-->init-c()");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        logger.info("MainServlet-->init()");
        super.init();
    }


}
