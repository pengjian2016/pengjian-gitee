package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class 套餐选择 {

    public 套餐  套餐1() {
        套餐 meal  = new 套餐();
        meal.addItem(new 可乐饮料());
        meal.addItem(new 猪肉汉堡());
        return meal;
    }

    public 套餐  套餐2() {
        套餐 meal  = new 套餐();
        meal.addItem(new 咖啡饮料());
        meal.addItem(new 蔬菜汉堡());
        return meal;
    }



}
