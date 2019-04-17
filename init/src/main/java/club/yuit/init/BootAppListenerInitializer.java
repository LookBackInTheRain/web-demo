package club.yuit.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;

/**
 * @author yuit
 * @date 2019/4/17 12:41
 */
public class BootAppListenerInitializer implements BootAppInitializer {

    private Logger logger = LoggerFactory.getLogger(BootAppListenerInitializer.class);
    @Override
    public void onStart(ServletContext context) {
        logger.debug("{}-->{}",this.getClass().getSimpleName(),"onStart()");
    }
}
