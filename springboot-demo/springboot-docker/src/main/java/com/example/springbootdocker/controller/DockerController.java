package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-21
 */
@RestController
public class DockerController {
    @GetMapping("/")
    public String index() {
        return "hello world \t spring boot docker";
    }

}
