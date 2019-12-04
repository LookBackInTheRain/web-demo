package club.yuit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @author yuit
 * @date 2019/11/4 11:10
 **/
public class MainInit implements ServletContainerInitializer {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        this.logger.info("Main INIT");
    }
}
