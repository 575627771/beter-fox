package com.wxh;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by wuxiaohong on 2018/3/23
 */
@FeignClient(name ="cloud-feign-producter")
public interface HelloRemoting {

    @RequestMapping("/hello")
    public String test(@RequestParam(value = "name") String name);
}
