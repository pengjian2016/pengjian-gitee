package com.example.rabbitmqdemo.demo.死信;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

import java.util.HashMap;
import java.util.Map;

/**
 * 正常消息接收
 *
 * @author pengjian
 * @since 2022-08-31
 */
public class 正常消息接收 {
    //普通交换机
    private static final String NORMAL_EXCHANGE = "normal_exchange";
    //死信交换机
    private static final String DEAD_EXCHANGE = "dead_exchange";


    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMQUtils.getChannel();
        channel.exchangeDeclare(NORMAL_EXCHANGE, BuiltinExchangeType.DIRECT);
        channel.exchangeDeclare(DEAD_EXCHANGE, BuiltinExchangeType.DIRECT);

        String deadQueueName = "dead-queue";
        channel.queueDeclare(deadQueueName, false, false, false, null);
        channel.queueBind(deadQueueName, DEAD_EXCHANGE, "lisi");

        //正常队列绑定死信队列信息
        Map<String, Object> params = new HashMap<>();
        //正常队列设置死信交换机 参数 key 是固定值
        params.put("x-dead-letter-exchange", DEAD_EXCHANGE);
        //正常队列设置死信 routing-key 参数 key 是固定值
        params.put("x-dead-letter-routing-key", "lisi");
        //设置最大长度
        params.put("x-max-length",6);

        String normalQueueName = "normal-queue";
        channel.queueDeclare(normalQueueName, false, false, false, params);
        channel.queueBind(normalQueueName, NORMAL_EXCHANGE, "zhangsan");

        System.out.println("等待接收消息........... ");
        //正常消费
        //DeliverCallback deliverCallback = (consumerTag, delivery) ->
        //{
        //    String message = new String(delivery.getBody(), "UTF-8");
        //    System.out.println("正常消息接收 接收到消息" + message);
        //};
        //主动巨虎
        DeliverCallback deliverCallback = (consumerTag, delivery) ->
        {
            String message = new String(delivery.getBody(), "UTF-8");
            if(message.equals("info==5")){
                System.out.println("Consumer01 接收到消息" + message + "并拒绝签收该消息");
                //requeue 设置为 false 代表拒绝重新入队 该队列如果配置了死信交换机将发送到死信队列中
                channel.basicReject(delivery.getEnvelope().getDeliveryTag(), false);
            }else {
                System.out.println("Consumer01 接收到消息"+message);
                channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
            }
        };
        //手动应答
        boolean autoAck = false;
        channel.basicConsume(normalQueueName, autoAck, deliverCallback, consumerTag -> {
        });
    }
}
