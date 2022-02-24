package com.example.design.设计模式.建造者模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class Test {
    public static void main(String[] args) {
       Builder builder = new CommonBuilder();
        Director director = new Director(builder);
        director.construct();
        Product result = builder.getResult();
        System.out.println(result);
    }
}
