package com.example.design.设计模式.工厂方法模式.普通工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("mail sender!");
    }
}
