package com.coltennye.omnilog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);

//        AppTest apptest = new AppTest();
//        apptest.setUp();
//        apptest.tryPersist();
//        apptest.tearDown();
    }
}
