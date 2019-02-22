package com.luqi.springcloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/1 16:17
 * @Version 1.0
 */
@RestController
public class UserManagementRibbonClient {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/listUsersByRibbon")
    public String ListUsersByRibbon(){
        String result = this.restTemplate.getForObject("http://service-user/listUsers", String.class);
        return result;
    }
}
