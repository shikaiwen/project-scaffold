package com.kevin.demo.config;


import com.kevin.demo.component.CacheInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
//@EnableWebMvc
@EnableScheduling
//@EnableAutoConfiguration
//@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com"})
class WebConfig extends WebMvcConfigurationSupport  {

    @Autowired
    CacheInterceptor cacheInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(cacheInterceptor);
    }
}
