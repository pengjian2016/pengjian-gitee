package com.example.design.设计模式.建造者模式.套餐举例;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class 纸质包装类  implements Packing{
    @Override
    public String pack() {
        return "这是纸质包装";
    }
}
