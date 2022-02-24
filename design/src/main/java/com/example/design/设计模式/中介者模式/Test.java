package com.example.design.设计模式.中介者模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
