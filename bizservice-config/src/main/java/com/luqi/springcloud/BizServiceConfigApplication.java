package com.luqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心服务器
 * http请求地址和资源文件映射如下:
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 * bizservice-config-client 配置中心客户端就是查找 master/service-config-client-dev.yml
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class BizServiceConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizServiceConfigApplication.class, args);
    }

}

