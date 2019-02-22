package com.luqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BizserviceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizserviceUserApplication.class, args);
    }

}

