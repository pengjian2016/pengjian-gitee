package com.example.design.设计模式.单例模式.懒汉式;

/**
 * @author pengjian
 * @since 2022-02-25
 */
public class Singleton {

    //静态内部类保证线程同步
    private static class SingletonHolder{
        private static Singleton singleton = new Singleton();
    }

    private Singleton(){
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }


}
