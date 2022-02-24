package com.example.design.设计模式.建造者模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();

    Product getResult();

}
