package com.sara.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan("com.sara")
public class WebMvcConfig implements WebMvcConfigurer {

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
//        internalResourceViewResolver.setSuffix(".jsp");
//        internalResourceViewResolver.setViewClass(JstlView.class);
//        return internalResourceViewResolver;
//    }

}
