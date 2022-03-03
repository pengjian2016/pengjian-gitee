package com.example.design.设计模式.桥接模式;

/**
 * @author pengjian
 * @since 2022-03-03
 */
public abstract class 形状上色 {

    上色 sourceable;

    public 上色 getSourceable() {
        return sourceable;
    }

    public void setSourceable(上色 sourceable) {
        this.sourceable = sourceable;
    }

    public void 形状(){
        sourceable.Color();
    }
}
