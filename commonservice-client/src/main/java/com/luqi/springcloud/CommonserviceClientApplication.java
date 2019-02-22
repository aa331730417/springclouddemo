package com.luqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonserviceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonserviceClientApplication.class, args);
    }

}

