package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class Test {
    public static void main(String[] args) {
        套餐选择 套餐选择 = new 套餐选择();
        套餐 meal = 套餐选择.套餐1();
        meal.showItems();
        System.out.println(meal.getCost());
    }
}
