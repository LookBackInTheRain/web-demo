package club.yuit.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;

/**
 * @author yuit
 * @date 2019/4/17 12:38
 */
public class BootAppFilterInitializer implements BootAppInitializer {

    private Logger logger = LoggerFactory.getLogger(BootAppFilterInitializer.class);

    @Override
    public void onStart(ServletContext context) {
        logger.debug("{}-->{}",this.getClass().getSimpleName(),"onStart()");
    }
}
