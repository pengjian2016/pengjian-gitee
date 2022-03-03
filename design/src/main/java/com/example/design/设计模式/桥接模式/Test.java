package com.example.design.设计模式.桥接模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Test {
    public static void main(String[] args) {
        上色 color1 = new 白色();
        color1.Color();
        形状上色 obj1  = new 正方形();
        obj1.setSourceable(color1);
        obj1.形状();


    }
}
