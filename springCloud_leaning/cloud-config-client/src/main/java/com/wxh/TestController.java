package com.wxh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wuxiaohong on 2018/3/23
 *
 * curl -X POST http://localhost:8002/bus/refresh
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${spring.test}")
    private String test;

    @RequestMapping("/test")
    public String test(){
        return this.test;
    }
}
