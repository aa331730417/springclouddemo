package com.luqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class BizserviceUserClientFeignApplication {

    /**
     * Feign 采用的是基于接口的注解
     * Feign 整合了ribbon，具有负载均衡的能力
     * 整合了Hystrix，具有熔断的能力
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BizserviceUserClientFeignApplication.class, args);
    }

}

