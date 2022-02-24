package com.example.design.设计模式.工厂方法模式.多工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }
    public Sender produceSms() {
        return new SmsSender();
    }
}
