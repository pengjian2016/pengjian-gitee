package com.example.rabbitmqdemo.spring.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 确认机制方案
 * @author pengjian
 * @since 2022-08-31
 */
@Component
public class ConfirmConfig {

    public static final String CONFIRM_EXCHANGE_NAME = "confirm.exchange";
    public static final String CONFIRM_QUEUE_NAME = "confirm.queue";
    public static final String CONFIRM_ROUTING_KEY= "key1";

    @Bean("confireQueue")
    public Queue confirmQueue() {
        return QueueBuilder.durable(CONFIRM_QUEUE_NAME).build();
    }

    @Bean
    public DirectExchange confirmExchange() {
        return  new DirectExchange(CONFIRM_EXCHANGE_NAME);
    }

    @Bean
    public Binding queueBinding(@Qualifier("confireQueue") Queue queue,
                                @Qualifier("confirmExchange") DirectExchange confirmExchange) {
        return BindingBuilder.bind(queue).to(confirmExchange).with(CONFIRM_ROUTING_KEY);
    }



}
