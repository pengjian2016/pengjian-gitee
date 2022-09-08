package com.example.rabbitmqdemo.demo.持久化;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 多个消费者轮询消费 手动应答是否消费
 * @author pengjian
 * @since 2022-08-31
 */
public class 消费者 {

    private final static String QUEUE_NAME = "mq_db";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMQUtils.getChannel();
        System.out.println("C1 等待接受消息耗时更长----");
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
        //手动应答
        boolean autoAck=false;
        channel.basicConsume(QUEUE_NAME, autoAck,callback, cancelCallback);
    }
}
