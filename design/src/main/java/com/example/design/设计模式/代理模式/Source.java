package com.example.design.设计模式.代理模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Source implements Sourceable{
    @Override
    public void method1() {
        System.out.println("被代理对象 方法 method1 ");
    }

    @Override
    public void method2() {
        System.out.println("被代理对象 方法 method2 ");
    }
}
