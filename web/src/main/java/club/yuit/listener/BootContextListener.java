package club.yuit.listener;

import club.yuit.filter.MainFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author yuit
 * @date 2019/4/16 16:50
 */
@WebListener
public class BootContextListener  implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(BootContextListener.class);


    @Override
    public void contextInitialized(ServletContextEvent sce) {

        logger.info("BootContextListener-->contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("BootContextListener-->contextDestroyed()");
    }
}
