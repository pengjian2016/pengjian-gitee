package com.example.design.设计模式.单例模式.CAS方式;



/**
 * @author pengjian
 * @since 2022-02-25
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance);
            });
            thread.setDaemon(false);
            thread.start();
        }
    }
}
