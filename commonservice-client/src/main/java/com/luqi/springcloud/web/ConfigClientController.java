package com.luqi.springcloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/2 11:15
 * @Version 1.0
 */
@RestController
public class ConfigClientController {

    @Value("${id}")
    private String id;

    @RequestMapping(value = "/hi")
    public String hi(){
        return id;
    }
}
