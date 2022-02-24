package com.example.design.设计模式.建造者模式;

/**
 * @author pengjian
 * @since 2022-02-24
 * 要创建的复杂对象
 */
public class Product {
    public String partA;
    public String partB;
    public String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
