package com.amk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author 阿明楷
 * @Date 2025/10/27:15:55
 * description:控制层的类（controller，springmvc）
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.amk.controller","com.amk.exceptionhandler"})
public class WebMvcJavaConfig implements WebMvcConfigurer {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
