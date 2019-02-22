package com.luqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CommonserviceEurekaHighApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonserviceEurekaHighApplication.class, args);
    }

}
