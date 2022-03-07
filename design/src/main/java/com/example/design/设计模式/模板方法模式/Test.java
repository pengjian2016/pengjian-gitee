package com.example.design.设计模式.模板方法模式;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class Test<psvm> {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new 加法();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
