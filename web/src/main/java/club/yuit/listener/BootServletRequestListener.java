package club.yuit.listener;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author yuit
 * @date 2019/4/16 11:15
 */
@WebListener
public class BootServletRequestListener implements ServletRequestListener {

    private Logger logger = LoggerFactory.getLogger(BootServletRequestListener.class);

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.debug("BootServletRequestListener-->requestDestroyed()");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.debug("BootServletRequestListener-->requestInitialized() ");
    }
}
