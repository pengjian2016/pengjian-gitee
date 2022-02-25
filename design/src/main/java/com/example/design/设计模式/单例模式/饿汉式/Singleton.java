package com.example.design.设计模式.单例模式.饿汉式;

/**
 * @author pengjian
 * @since 2022-02-25
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return singleton;
    }

}
