package com.example.design.设计模式.适配器模式;

/**
 * @author pengjian
 * @since 2022-02-28
 */
public class Test {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
