package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class 咖啡饮料 extends 饮料抽象类 {
    @Override
    public String name() {
        return "咖啡饮料";
    }

    @Override
    public float price() {
        return 23.0f;
    }

}
