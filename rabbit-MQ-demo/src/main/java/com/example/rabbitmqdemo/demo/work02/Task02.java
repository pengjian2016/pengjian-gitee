package com.example.rabbitmqdemo.demo.work02;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/**
 * 生产者
 * @author pengjian
 * @since 2022-08-31
 */
public class Task02 {
    private final static String QUEUE_NAME = "hello2";

    public static void main(String[] args) {
        try {
            Channel channel = RabbitMQUtils.getChannel();
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String message = scanner.next();
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                System.out.println("消息发送完毕！");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }


    }
}
