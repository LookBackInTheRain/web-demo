package club.yuit.init2;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author yuit
 * @date 2019/11/4 14:20
 **/
@HandlesTypes(BootInit2.class)
public class BootServletContainerInit2 implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("BootServletContainerInit2:===> "+c.size());
    }
}
