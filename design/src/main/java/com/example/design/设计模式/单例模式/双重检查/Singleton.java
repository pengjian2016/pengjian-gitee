package com.example.design.设计模式.单例模式.双重检查;

/**
 * @author pengjian
 * @since 2022-02-25
 */
public class Singleton {
    private static volatile Singleton obj;

    private Singleton(){

    }

    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }

}
