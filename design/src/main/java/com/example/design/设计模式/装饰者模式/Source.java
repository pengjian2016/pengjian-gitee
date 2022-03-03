package com.example.design.设计模式.装饰者模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("Source the original method!");
    }
}
