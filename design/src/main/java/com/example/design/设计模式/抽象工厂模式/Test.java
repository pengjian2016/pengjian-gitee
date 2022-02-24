package com.example.design.设计模式.抽象工厂模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class Test {
    public static void main(String[] args) {
        Provider factory = new SendSmsFactory();
        Sender produce = factory.produce();
        produce.send();
    }
}
