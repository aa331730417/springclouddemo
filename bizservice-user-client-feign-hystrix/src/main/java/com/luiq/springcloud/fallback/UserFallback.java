package com.luiq.springcloud.fallback;

import com.luiq.springcloud.client.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/21 15:18
 * @Version 1.0
 */
@Component
public class UserFallback implements UserFeignClient {

    @Override
    public String listUsers() {
        return "出现熔断！Feign调用失败";
    }

}