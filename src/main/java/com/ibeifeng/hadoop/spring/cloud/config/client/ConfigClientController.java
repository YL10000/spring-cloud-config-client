package com.ibeifeng.hadoop.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    //将配置服务器端的 my.message=hellowordPro信息注入到ConfigUrl变量中
    @Value("${my.message}")
    private String ConfigUrl;
    
    @Value("${foo}")
    private String foo;
    
    @RequestMapping("/hi")
    String hello(){
        return "hello :"+ConfigUrl+"---"+foo;
    }
}
