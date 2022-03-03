package com.example.design.设计模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class 动态代理  implements InvocationHandler {
    Object object;

    public 动态代理(Object object) {
        super();
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("method1".equals(method.getName())) {
            System.out.println("动态代理 method1 before dynamicProxy!");
            method.invoke(object, args);
            System.out.println("动态代理 method1 before dynamicProxy!");
        } else if ("method2".equals(method.getName())) {
            System.out.println("动态代理 method2 before dynamicProxy1!");
            method.invoke(object, args);
            System.out.println("动态代理 method2 before dynamicProxy1!");
        }
        return null;
    }
}
