package com.luqi.springcloud.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/15 15:23
 * @Version 1.0
 */
@RestController
public class UserManagementRibbonClient {

    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    @GetMapping("/listUsersByRibbon")
    @HystrixCommand(fallbackMethod = "listUsersByRibbonFallback")
    public String listUsersByRibbon() {
        String result = this.restTemplate.getForObject("http://service-user/listUsers", String.class);
        return result;
    }

    public String listUsersByRibbonFallback() {
        return "出现熔断！接口异常，端口：" + port;
    }
}