package com.example.rabbitmqdemo.demo.work;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 多个消费者 自动应答
 * @author pengjian
 * @since 2022-08-31
 */
public class Worler01 {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMQUtils.getChannel();
        System.out.println("C2 等待接受消息----");
        DeliverCallback callback = (s, delivery) -> {
            byte[] body = delivery.getBody();
            String message = new String(body);
            System.out.println("接收到消息==" + message);
        };
        CancelCallback cancelCallback = (String s)->{
                System.out.println("消费消息被中断！！");
        };
        channel.basicConsume(QUEUE_NAME, true,callback, cancelCallback);


    }
}
