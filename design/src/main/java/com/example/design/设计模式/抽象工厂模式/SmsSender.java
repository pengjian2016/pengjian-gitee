package com.example.design.设计模式.抽象工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("Sms sender!");
    }
}
