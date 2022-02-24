package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class 可乐饮料 extends 饮料抽象类 {
    @Override
    public String name() {
        return "可乐饮料";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
