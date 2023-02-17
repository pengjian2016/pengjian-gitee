package com.example.springbootrabbit.config;

import com.example.springbootrabbit.enums.QueueEnum;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.CustomExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-02-08
 */
@Configuration
public class RabbitMqConfig {
    /**
     * 机器人消息重启插件消息队列所绑定的交换机
     */
    @Bean
    CustomExchange customExchange(){
        //创建一个自定义交换机，可以发送延迟消息
        java.util.Map<String, Object> args = new HashMap<>();
        args.put("x-delayed-type", "direct");
        return new CustomExchange(QueueEnum.QUEUE_RESET_MESSAGE_CANCEL.getExchange(), "x-delayed-message", true, false, args);

    }


      // * 机器人消息重启插件队列
    @Bean
    public Queue chatPluginQueue() {
        return new Queue(QueueEnum.QUEUE_RESET_MESSAGE_CANCEL.getName());
    }

    /**
     * 将机器人消息重启插件队列绑定到交换机
     */
    @Bean
    public Binding chatPluginBinding(CustomExchange chatPluginDirect, Queue chatPluginQueue) {
        return BindingBuilder
                .bind(chatPluginQueue)
                .to(chatPluginDirect)
                .with(QueueEnum.QUEUE_RESET_MESSAGE_CANCEL.getRouteKey())
                .noargs();
    }
}
