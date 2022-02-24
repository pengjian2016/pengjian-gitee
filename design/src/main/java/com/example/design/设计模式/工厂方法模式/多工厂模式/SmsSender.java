package com.example.design.设计模式.工厂方法模式.多工厂模式;

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
