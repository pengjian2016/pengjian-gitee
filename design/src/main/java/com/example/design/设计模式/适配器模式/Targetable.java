package com.example.design.设计模式.适配器模式;

/**
 * @author pengjian
 * @since 2022-02-28
 */
public interface Targetable {
    //于原类中的方法相同
    void method1();

    //新类的方法
    void method2();
}
