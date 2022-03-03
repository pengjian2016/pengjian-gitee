package com.example.design.设计模式.外观模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
