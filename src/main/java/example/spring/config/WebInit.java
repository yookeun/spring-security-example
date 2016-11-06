package example.spring.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by yookeun on 2016. 9. 13..
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class<?>[] { WebConfig.class };
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[] { WebConfig.class };
    }


}
