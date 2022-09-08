package com.example.rabbitmqdemo.demo.hello;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 生产者
 * @author pengjian
 * @since 2022-08-31
 */
public class Producer {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("admin");
        factory.setPassword("123");

        try {
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            //生成一个队列
            /**
             * 1队列名称
             * 2队列是否持久化，默认在内存中
             * 3该队列是否只有一个消费者消费 true 多个消费者
             * 4是否自动删除最后一个消费者断开连接，该队列自动删除true
             * 5其他参数
             */
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);

            String message = "hello world";
            //发送消息
            /**
             * 1发送到哪个交换机
             * 2路由的key是哪个
             * 3其他参数
             * 4发送消息的消息体
             */
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("消息发送完毕！");







        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }


    }
}
