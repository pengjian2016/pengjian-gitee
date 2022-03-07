package com.example.design.设计模式.模板方法模式;


/**
 * @author pengjian
 * @since 2022-03-07
 */
public class 加法 extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
