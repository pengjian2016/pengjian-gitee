package com.example.rabbitmqdemo.demo.持久化;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/**
 * 生产者
 * @author pengjian
 * @since 2022-08-31
 */
public class 生产者 {
    private final static String QUEUE_NAME = "mq_db";

    public static void main(String[] args) {
        try {
            Channel channel = RabbitMQUtils.getChannel();
            //消息队列持久化
            boolean db = true;
            channel.queueDeclare(QUEUE_NAME,db,false,false,null);
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String message = scanner.next();
                //消息持久化
                channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_BASIC, message.getBytes());
                System.out.println("消息发送完毕！");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }


    }
}
