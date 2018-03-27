package com.wxh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wuxiaohong on 2018/3/23
 */
@RestController
public class TestController {

    @Autowired
    private HelloRemoting helloRemoting;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable(value = "name") String name){
        return helloRemoting.hehe2(name);
    }
}
