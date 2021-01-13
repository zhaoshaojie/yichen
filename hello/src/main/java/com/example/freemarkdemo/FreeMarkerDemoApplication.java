package com.example.freemarkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FreeMarkerDemoApplication {

   /* public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }*/

    public static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(FreeMarkerDemoApplication.class, args);
    }

}
