package com.example.design.设计模式.策略模式;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class 加法  extends AbstractCalculator implements ICalculator{
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0]-arrayInt[1];
    }
}
