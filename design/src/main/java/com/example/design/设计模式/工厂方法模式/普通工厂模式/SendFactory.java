package com.example.design.设计模式.工厂方法模式.普通工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("工厂还未入录");
            return null;
        }

    }
}
