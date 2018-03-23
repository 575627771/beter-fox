package com.wxh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wuxiaohong on 2018/3/23
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String test(@RequestParam(value = "name") String name){
        return "我是---提供者1---我被"+name+"调用了";
    }
}
