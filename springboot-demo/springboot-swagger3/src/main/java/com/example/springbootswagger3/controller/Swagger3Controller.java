package com.example.springbootswagger3.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * http://127.0.0.1:8080/swagger-ui/index.html
 * http://localhost:10002
 * @author pengjian
 * @since 2022-11-29
 */
@Api("Hello控制类")
@RestController
public class Swagger3Controller {

    @GetMapping(value = "/user")
    public Object getUser(){
        return Map.of("愚公要移山", "123456");
    }

    @ApiOperation("可以指定参数的API")
    @PostMapping("/param")
    public String hello2(@ApiParam("用户名") String name){
        return "hello" + name;
    }
}
