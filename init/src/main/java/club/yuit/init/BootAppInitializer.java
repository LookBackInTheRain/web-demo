package club.yuit.init;

import javax.servlet.ServletContext;

/**
 * @author yuit
 * @date 2019/4/17 12:36
 */
public interface BootAppInitializer {

    /**
     * 启动时
     * @param context
     */
    void onStart(ServletContext context);

}
