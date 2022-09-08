package com.example.rabbitmqdemo.demo.死信;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;

/**
 * 生产者
 *
 * @author pengjian
 * @since 2022-08-31
 */
public class 生产者 {
    private static final String EXCHANGE_NAME = "normal_exchange";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMQUtils.getChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        //1消息过期时间
        AMQP.BasicProperties properties = new AMQP.BasicProperties.Builder().expiration("10000").build();
        //2 队列限制个数
        for (int i = 0; i < 11; i++) {
            String message = "info==" + i;
            channel.basicPublish(EXCHANGE_NAME, "zhangsan", properties, message.getBytes());
            System.out.println("生产者发出消息:" + message);
        }
    }

}
