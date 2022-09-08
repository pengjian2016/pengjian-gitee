package com.example.rabbitmqdemo.demo.发布确认模式;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author pengjian
 * @since 2022-08-31
 */
public class 消费者1 {

    private final static String QUEUE_NAME = "confirmation-mode";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMQUtils.getChannel();
        System.out.println("C1 等待接受消息耗时----");
        DeliverCallback callback = (s, delivery) -> {
            byte[] body = delivery.getBody();
            String message = new String(body);
            System.out.println("接收到消息==" + message);
            //false 信道里多个消息 只确认callback里面的   true确认信道里所有消息
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);

        };
        CancelCallback cancelCallback = (String s)->{
                System.out.println("消费消息被中断！！");
        };
        //不公平分发 预期值 一开始在信道里放消息条数
        channel.basicQos(1);
        //手动应答
        boolean autoAck=false;
        channel.basicConsume(QUEUE_NAME, autoAck,callback, cancelCallback);
    }
}
