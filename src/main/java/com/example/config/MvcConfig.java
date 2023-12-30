package com.example.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/note/list").setViewName("list");
        registry.addViewController("/note/delete").setViewName("delete");
        registry.addViewController("/note/edit").setViewName("edit");
        registry.addViewController("/note/add").setViewName("add");
        registry.addViewController("/login").setViewName("login");
    }

}
