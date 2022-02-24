package com.example.design.设计模式.建造者模式.套餐举例;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjian
 * @since 2022-02-24
 */
public class 套餐 {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
