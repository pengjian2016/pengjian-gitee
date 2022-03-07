package com.example.design.设计模式.策略模式;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public abstract class  AbstractCalculator  implements ICalculator{

    public int[] split(String exp,String opt){
        String[] array = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
