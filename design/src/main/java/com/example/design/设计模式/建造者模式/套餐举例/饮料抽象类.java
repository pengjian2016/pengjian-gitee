package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public abstract  class 饮料抽象类 implements Item {

    @Override
    public Packing packing() {
        return new 瓶子包装类();
    }

    @Override
    public abstract float price();

}
