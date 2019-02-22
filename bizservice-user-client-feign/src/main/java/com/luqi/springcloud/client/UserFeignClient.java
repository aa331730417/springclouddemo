package com.luqi.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/1 17:10
 * @Version 1.0
 */
@FeignClient(name="service-user")
@Component
public interface UserFeignClient {

    @GetMapping("/listUsers")
    public String listUsers();

}