package com.example.rabbitmqdemo.demo.死信;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Delivery;

import java.io.IOException;

/**
 * 死信消息接收
 * @author pengjian
 * @since 2022-08-31
 */
public class 死信消息接收 {
    //死信交换机
    private static final String DEAD_EXCHANGE = "dead_exchange";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMQUtils.getChannel();
        channel.exchangeDeclare(DEAD_EXCHANGE, BuiltinExchangeType.DIRECT);
        String queueName = "dead-queue";
        channel.queueDeclare(queueName, false, false, false, null);
        channel.queueBind(queueName, DEAD_EXCHANGE, "lisi");
        System.out.println("死信消息接收=........... ");
        DeliverCallback callback = new DeliverCallback() {
            @Override
            public void handle(String s, Delivery delivery) throws IOException {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println("死信消息接收=="+message);
            }
        };
        channel.basicConsume(queueName, true, callback, consumerTag -> {});
    }
}
