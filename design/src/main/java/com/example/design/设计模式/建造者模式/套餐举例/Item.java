package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 * 创建一个表示食物条目和食物包装的接口。
 */
public interface Item {

    public String name();

    public Packing packing();

    public float price();
}
