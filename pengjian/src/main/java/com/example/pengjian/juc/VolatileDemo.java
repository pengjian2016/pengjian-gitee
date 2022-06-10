package com.example.pengjian.juc;

/**
 * @author pengjian
 * @since 2022-05-16
 */
public class VolatileDemo {
    int a = 1;
    int b = 2;
    public void change(){
        a = 3;
        b = a;
    }
    public void print(){
        System.out.println("b="+b+";a="+a);
    }

    public static void main(String[] args) {
        while (true) {
            final VolatileDemo test = new VolatileDemo();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.change();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.print();
                }
            }).start();
        }

    }

}
