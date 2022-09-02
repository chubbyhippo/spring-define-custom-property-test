package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var properties = new Properties();
        properties.setProperty("my.property", "hello");
        var application = new SpringApplication(DemoApplication.class);
        application.setDefaultProperties(properties);
        application.run(args);
    }

}
