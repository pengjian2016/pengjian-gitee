package com.example.rabbitmqdemo.demo.hello;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 消费者
 * @author pengjian
 * @since 2022-08-31
 *
 */
public class Consumer {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("admin");
        factory.setPassword("123");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        System.out.println("等待接受消息----");
        DeliverCallback callback = new DeliverCallback() {
            @Override
            public void handle(String s, Delivery delivery) throws IOException {
                byte[] body = delivery.getBody();
                String message = new String(body);
                System.out.println(message);
            }
        };
        CancelCallback cancelCallback = new CancelCallback() {
            @Override
            public void handle(String s) throws IOException {
                System.out.println("消费消息被中断！！");
            }
        };
        //消费消息
        /**
         * 1消费哪个队列
         * 2消费成功是否自动应答 true自动 false手动
         * 3消费者未成功消费的回调
         */
        channel.basicConsume(QUEUE_NAME, true,callback, cancelCallback);


    }
}
