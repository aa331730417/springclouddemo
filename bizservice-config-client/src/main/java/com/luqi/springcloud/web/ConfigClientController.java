package com.luqi.springcloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: I_UO_I
 * @Date: 2019/2/22 9:46
 * @Version 1.0
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo(){
        return foo;
    }
}
