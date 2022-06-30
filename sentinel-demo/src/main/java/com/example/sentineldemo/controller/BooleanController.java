package com.example.sentineldemo.controller;

import com.alibaba.csp.sentinel.SphO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengjian
 * @since 2022-06-22
 */
@RestController
public class BooleanController {

    @GetMapping("boolean")
    public boolean returnBoolean() {
        if(SphO.entry("sentinel-Boolean")){
            try {
                System.out.println("hello sentinel boolean");
                return true;
            }finally {
                SphO.exit();
            }
        }else{
            System.out.println("系统繁忙,请稍后再试");
            return false;
        }
    }









}
