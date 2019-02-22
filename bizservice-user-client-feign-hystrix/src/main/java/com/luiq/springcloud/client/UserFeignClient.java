package com.luiq.springcloud.client;

import com.luiq.springcloud.fallback.UserFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/21 15:17
 * @Version 1.0
 */
@FeignClient(name="service-user", fallback=UserFallback.class)
public interface UserFeignClient {

    @GetMapping("/listUsers")
    public String listUsers();

}