package com.example.rabbitmqdemo.spring.controller;

import com.example.rabbitmqdemo.spring.config.ConfirmConfig;
import com.example.rabbitmqdemo.spring.consumer.MyCallBack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


/**
 * 确认机制方案
 * @author pengjian
 * @since 2022-08-31
 */

@Slf4j
@RestController
@RequestMapping("/confirm")
public class ProducerController {

    @Resource
    RabbitTemplate rabbitTemplate;
    @Resource
    MyCallBack myCallBack;

    @GetMapping("/sendMsg/{message}")
    public void sendMsg(@PathVariable  String message) {
        rabbitTemplate.convertAndSend(ConfirmConfig.CONFIRM_EXCHANGE_NAME, ConfirmConfig.CONFIRM_ROUTING_KEY, message);
        log.info("发送消息内容:{}",message);
    }



    //依赖注入 rabbitTemplate 之后再设置它的回调对象
    @PostConstruct
    public void init() {
        rabbitTemplate.setConfirmCallback(myCallBack);
    }
    @GetMapping("/sendMsg2/{message}")
    public void sendMsg2(@PathVariable  String message) {
        log.info("发送消息内容:{}",message);
        CorrelationData data1 = new CorrelationData("1");
        String routingKey = "key1";
        rabbitTemplate.convertAndSend(ConfirmConfig.CONFIRM_EXCHANGE_NAME,
                routingKey, message+routingKey,data1);

        CorrelationData data2 = new CorrelationData("2");
        String routingKey2 = "key2";
        rabbitTemplate.convertAndSend(ConfirmConfig.CONFIRM_EXCHANGE_NAME,
                routingKey2, message+routingKey2,data2);


    }
}

