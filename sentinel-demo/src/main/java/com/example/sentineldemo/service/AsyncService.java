package com.example.sentineldemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author pengjian
 * @since 2022-06-22
 */
@Service
public class AsyncService {
    //Async表示方法为异步调用
    @Async
    public void hello(){
        System.out.println("异步调用开始======");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("异步调用结束=====");
    }
}
