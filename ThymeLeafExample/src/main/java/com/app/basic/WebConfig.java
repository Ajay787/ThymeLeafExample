package com.app.basic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@SpringBootApplication
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler(
//                "/img/**",
//                "/css/**",
//                "/js/**")
//                .addResourceLocations(
//                        "classpath:/resource/static/img/",
//                        "classpath:/resource/static/css/",
//                        "classpath:/resource/static/js/");
    	registry.addResourceHandler("/resources/**")
        .addResourceLocations("/resources/");
        super.addResourceHandlers(registry);
    }

}