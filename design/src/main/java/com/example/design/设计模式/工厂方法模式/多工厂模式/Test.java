package com.example.design.设计模式.工厂方法模式.多工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender produce = factory.produceMail();
        produce.send();
    }
}
