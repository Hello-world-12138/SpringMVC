package com.amk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 阿明楷
 * @Date 2025/10/25:15:28
 * @See:
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.amk.jsp")
    public class MvcConfig implements WebMvcConfigurer{

        @Override
        public void configureViewResolvers(ViewResolverRegistry registry) {
            registry.jsp("/WEB-INF/views/", ".jsp");
        }
    }

