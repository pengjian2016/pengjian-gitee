package com.example.rabbitmqdemo.demo.发布确认模式;

import com.example.rabbitmqdemo.demo.util.RabbitMQUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmCallback;

import java.io.IOException;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * 生产者
 * @author pengjian
 * @since 2022-08-31
 */

public class 生产者 {
    private final static String QUEUE_NAME = "confirmation-mode";
    private final static int MESSAGE_COUNT = 100;

    public static void main(String[] args) {
        //publishMessageIndividually();
        //publishMessageIndividuallyMore();
        publishMessageIndividuallyAsync();

    }

    //单个确认发布
    public static void publishMessageIndividually() {
        try {
            Channel channel = RabbitMQUtils.getChannel();
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
           //发布确认模式
            channel.confirmSelect();
            long begin = System.currentTimeMillis();
            for (int i = 0; i < MESSAGE_COUNT; i++) {
                String message = i + "==";
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                //服务端返回 false 或超时时间内未返回，生产者可以消息重发
                boolean flag = channel.waitForConfirms();
                if(flag){
                    System.out.println("消息发送成功");
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("发布" + MESSAGE_COUNT + "个单独确认消息,耗时" + (end - begin) + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //批量确认发布
    public static void publishMessageIndividuallyMore() {
        try {
            Channel channel = RabbitMQUtils.getChannel();
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
           //发布确认模式
            channel.confirmSelect();
            //批量确认消息大小
            int batchSize = 100;
            //未确认消息个数
            int outstandingMessageCount = 0;
            long begin = System.currentTimeMillis();
            for (int i = 0; i < MESSAGE_COUNT; i++) {
                String message = i + "==";
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                outstandingMessageCount++;
                if (outstandingMessageCount == batchSize) {
                    channel.waitForConfirms();
                    outstandingMessageCount = 0;
                }
            }
            if (outstandingMessageCount > 0) {
                channel.waitForConfirms();
            }
            long end = System.currentTimeMillis();
            System.out.println("发布" + MESSAGE_COUNT + "个单独确认消息,耗时" + (end - begin) + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //异步确认发布
    public static void publishMessageIndividuallyAsync() {
        try {
            Channel channel = RabbitMQUtils.getChannel();
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
           //发布确认模式
            channel.confirmSelect();

            ConcurrentSkipListMap<Long, String> outsandingConfirs = new ConcurrentSkipListMap<>();

            ConfirmCallback ackCallback = new ConfirmCallback() {
                @Override
                public void handle(long l, boolean b) throws IOException {
                    if (b) {
                        ConcurrentNavigableMap<Long, String> confirmed = outsandingConfirs.headMap(l, true);
                        confirmed.clear();
                    }else {
                        outsandingConfirs.remove(l);
                    }
                }
            };

            ConfirmCallback nackCallback = new ConfirmCallback() {
                @Override
                public void handle(long l, boolean b) throws IOException {
                    String message = outsandingConfirs.get(l);
                    System.out.println("发布的消息"+message+"未被确认，序列号"+l);
                }
            };

            channel.addConfirmListener(ackCallback, null);


            long begin = System.currentTimeMillis();
            for (int i = 0; i < MESSAGE_COUNT; i++) {
                String message = i + "消息";
                outsandingConfirs.put(channel.getNextPublishSeqNo(), message);
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            }
            long end = System.currentTimeMillis();
            System.out.println("发布" + MESSAGE_COUNT + "个单独确认消息,耗时" + (end - begin) + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
