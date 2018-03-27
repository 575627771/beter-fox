package com.wxh;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by wuxiaohong on 2018/3/26
 */
@Component
public class HelloTemotingHystrix implements HelloRemoting {

    @Override
    public String hehe(@RequestParam(value = "name") String name) {
        return "消息发送失败--------这是熔断器返回消息:"+name;
    }
}
