package com.example.design.设计模式.装饰者模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();

    }
}
