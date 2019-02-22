package com.luqi.springcloud.api;

import com.luqi.springcloud.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/1 17:11
 * @Version 1.0
 */
@RestController
public class UserFeignApi {

    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/listUsersByFeign")
    public String ListUsers(){
        String users = this.userFeignClient.listUsers();
        return users;
    }

}
