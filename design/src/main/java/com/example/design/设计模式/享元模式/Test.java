package com.example.design.设计模式.享元模式;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = ConnectionPool.getInstance();
        System.out.println("初始化完成，线程池共有" + pool.getPool().size() + "个线程");
        int i = pool.getConnection();
        System.out.println("取得线程" + i + "现在还有" + pool.getPool().size() + "个线程");
    }
}
