package com.example.design.设计模式.原型模式;

import java.io.*;

/**
 * @author pengjian
 * @since 2022-02-25
 */
public class Prototype implements  Cloneable , Serializable {
//* 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，
// 而引用类型的变量，指向的还是原对象所指向的。（对象本身会重新创建）


// * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
// 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。

    private String string;

    private MyObject myObject;

    public Prototype(String string) {
        this.string = string;
        this.myObject = new MyObject();
    }

    //浅复制
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    //深复制
    public Object deepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ByteArrayOutputStream byteoutStream = new ByteArrayOutputStream();
        ObjectOutputStream objoutStream = new ObjectOutputStream(byteoutStream);
        objoutStream.writeObject(this);

        ByteArrayInputStream byteinputStream = new ByteArrayInputStream(byteoutStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteinputStream);

        return objectInputStream.readObject();
    }





    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }

    class MyObject implements Serializable{

    }
}
