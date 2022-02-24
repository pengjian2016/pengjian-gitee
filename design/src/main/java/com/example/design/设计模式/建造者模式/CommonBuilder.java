package com.example.design.设计模式.建造者模式;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class CommonBuilder implements Builder {
    Product product = new Product();
    String partA="A", partB="B", partC="C";

    @Override
    public void buildPartA() {
        product.setPartA(partA);
    }

    @Override
    public void buildPartB() {
        product.setPartA(partB);
    }

    @Override
    public void buildPartC() {
        product.setPartA(partC);
    }

    @Override
    public Product getResult() {
        return product;
    }
}
