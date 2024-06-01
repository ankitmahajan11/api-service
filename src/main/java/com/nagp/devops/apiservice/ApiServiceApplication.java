package com.nagp.devops.apiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan({"com.nagp.devops.apiservice.entity"})
@ComponentScan(value = {"com.nagp.devops.apiservice"})
//@EnableJpaRepositories("com.nagp.devops.apiservice")
public class ApiServiceApplication {
    public static void main(String[] args) {
        System.out.println("inside main method");
        System.out.println("DB Name"+System.getenv().get("DB_NAME"));
        System.out.println("DB service"+System.getenv().get("DB_SERVER"));
        System.out.println("DB Name"+System.getenv().get("DB_USERNAME"));
        System.out.println("DB Name"+System.getenv().get("DB_PASSWORD"));

        SpringApplication.run(ApiServiceApplication.class, args);
    }

}
