package com.example.design.设计模式.代理模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class 静态代理  implements Sourceable{
    private Source source;

    public 静态代理(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        System.out.println("静态代理 method1 before proxy!");
        source.method1();
        System.out.println("静态代理 method1 after proxy!");
    }

    @Override
    public void method2() {
        System.out.println("静态代理 method2 before proxy!");
        source.method2();
        System.out.println("静态代理 method2 after proxy!");
    }
}
