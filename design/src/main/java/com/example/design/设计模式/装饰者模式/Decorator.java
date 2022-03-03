package com.example.design.设计模式.装饰者模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Decorator implements Sourceable{
    public Source source;

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
