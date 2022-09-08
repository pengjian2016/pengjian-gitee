package com.example.rabbitmqdemo.spring.consumer;

import com.example.rabbitmqdemo.spring.config.ConfirmConfig;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author pengjian
 * @since 2022-08-31
 */
@Slf4j
@Component
public class ConfirmConsumer {

    @RabbitListener(queues = ConfirmConfig.CONFIRM_QUEUE_NAME)
    public void receive(Message message, Channel channel) {
        String msg = new String(message.getBody());
        log.info("接受到队列 confirm.queue 消息:{}",msg);
    }
}
