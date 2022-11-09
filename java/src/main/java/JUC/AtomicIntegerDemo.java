package JUC;


import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class AtomicIntegerDemo {



    @Test
    public void test1() {
        AtomicInteger atomicInteger = new AtomicInteger();
        // 在操作之前先赋值，如果不显式赋值则值默认为 0 ，就像 int 型变量使用前做初始化赋值一样。
        System.out.println(atomicInteger.get()); //0
        atomicInteger.set(10);
        System.out.println(atomicInteger.get()); //10
        // 先获取当前值，之后再对原值加100
        atomicInteger.getAndAdd(100);
        System.out.println(atomicInteger.get()); //110
        // 先获取当前值，之后再对原值减1
        atomicInteger.getAndDecrement();
        System.out.println(atomicInteger.get()); //109
    }


    @Test
    public void test2() {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.getAndAdd(10));//0
        System.out.println(atomicInteger.get());//10
        System.out.println(atomicInteger.addAndGet(-10));//0
    }

    @Test
    public void test3() {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.get());//0
        System.out.println(atomicInteger.getAndIncrement());// 0，获取当前值并自增1
        System.out.println(atomicInteger.get());//1
        System.out.println(atomicInteger.incrementAndGet()); // 2，当前值先自增1再获取
        System.out.println(atomicInteger.get());  // 2
    }

    @Test
    public void test4(){
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.get());//10
        int expect = 12;
        int update = 20;
        // 10 不等于 12 不满足期望，所以返回false，且保持原值不变
        boolean b = atomicInteger.compareAndSet(expect, update);
        System.out.println(b);
        System.out.println(atomicInteger.get());
    }




    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(100);
        for (int i = 1; i < 6; i++) {
            Ticket ticket = new Ticket(atomicInteger, i + "");
            new Thread(ticket).start();
        }
    }
}

class Ticket implements Runnable {
    AtomicInteger total;
    String name;

    public Ticket(AtomicInteger total, String name) {
        this.total = total;
        this.name =  "第" + name + "售票窗口";;
    }

    @Override
    public void run() {
        while (true) {
            if (total.get() < 1) {
                System.out.println("票已售完，" + name + "结束售票");
                return;
            }

            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int last = total.decrementAndGet();
            if (last >= 0) {
                System.out.println(name + "已出票，还剩" + last + "张票");
            }






        }


    }
}