package cn.zpro.sso.app.config;


import cn.zpro.sso.app.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhanggl
 */
@Configuration
public class InterceptConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/sso/**")
        .excludePathPatterns("/sso/4*")
        .excludePathPatterns("/sso/index*")
        .excludePathPatterns("/sso/login*");
    }
}
