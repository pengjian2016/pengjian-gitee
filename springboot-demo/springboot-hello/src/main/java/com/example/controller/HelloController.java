package com.example.controller;

import cn.hutool.core.io.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("host")
    public Object host() {
        String host = "E:\\GoogleHost\\hosts\\hosts";
        File file = new File(host);
        byte[] bytes = FileUtil.readBytes(file);
        return new String(bytes);
    }

    @RequestMapping("translate")
    public Object host2() {
        String host = "E:\\GoogleHost\\hosts\\translate-hosts";
        File file = new File(host);
        byte[] bytes = FileUtil.readBytes(file);
        return new String(bytes);
    }


}