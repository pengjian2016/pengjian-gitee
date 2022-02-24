package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class 蔬菜汉堡  extends 汉堡抽象类{

    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 100.0f;
    }
}
