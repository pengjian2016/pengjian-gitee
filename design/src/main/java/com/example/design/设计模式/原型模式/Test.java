package com.example.design.设计模式.原型模式;

import java.io.IOException;

/**
 * @author pengjian
 * @since 2022-02-25
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        Prototype prototype = new Prototype("pan");
        Prototype clone;
        Prototype deepclone;

        clone = (Prototype) prototype.clone();
        deepclone = (Prototype) prototype.deepClone();

        clone.setString("clone");
        deepclone.setString("deepclone");

        System.out.println("prototype:" + prototype.getString() + " SerializableObject:" + prototype.getMyObject());
        System.out.println("clone:" + clone.getString() + " SerializableObject:" + clone.getMyObject());
        System.out.println("deepclone:" + deepclone.getString() + " SerializableObject:" + deepclone.getMyObject());

    }
}
