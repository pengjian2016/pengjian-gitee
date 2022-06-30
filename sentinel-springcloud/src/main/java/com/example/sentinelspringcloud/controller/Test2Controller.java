package com.example.sentinelspringcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjian
 * @since 2022-06-22
 */
@RestController
public class Test2Controller {

    @SentinelResource(value = "sentinel_cloud",blockHandler = "exceptionHandler")
    @GetMapping("/cloud")
    public String ann(){
        //使用限流规则
        return "Hello Sentinel";
    }

    public String exceptionHandler(BlockException e){
        e.printStackTrace();
        return "系统繁忙请稍后再试";
    }
}
