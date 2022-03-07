package com.example.design.设计模式.解释器模式;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class 减法 implements 组合接口 {

    @Override
    public int interpret(两个数字 context) {
        return context.getNum1() - context.getNum2();
    }
}
