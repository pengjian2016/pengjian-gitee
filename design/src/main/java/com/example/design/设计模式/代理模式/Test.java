package com.example.design.设计模式.代理模式;

import java.lang.reflect.Proxy;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Test {
    public static void main(String[] args) {

        Source source = new Source();
        静态代理 obj = new 静态代理(source);
        obj.method1();
        System.out.println("=========");
        obj.method2();

        System.out.println("===============================");

        动态代理 obj2 = new 动态代理(source);
        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(Source.class.getClassLoader(), Source.class.getInterfaces(), obj2);
        sourceable.method1();
        System.out.println("=========");
        sourceable.method2();


    }
}
