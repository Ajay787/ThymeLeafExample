package com.app.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeLeafExampleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ThymeLeafExampleApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ThymeLeafExampleApplication.class);
    }
}
