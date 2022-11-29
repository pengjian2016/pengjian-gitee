package com.example.springbootopenapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * http://127.0.0.1:8080/swagger-ui.html
 * @author pengjian
 * @since 2022-11-29
 */
@Tag(name ="Hello控制类")
@RestController
public class SpringDocController {

    @GetMapping(value = "/user")
    public Object getUser(){
        return Map.of("愚公要移山", "123456");
    }

    @Operation(description = "可以指定参数的API")
    @PostMapping("/param")
    public String hello2(@Parameter(name = "用户名") String name){
        return "hello" + name;
    }
}
