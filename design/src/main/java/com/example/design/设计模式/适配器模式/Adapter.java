package com.example.design.设计模式.适配器模式;

/**
 * @author pengjian
 * @since 2022-02-28
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is Adapter  method2 !");
    }
}
