package JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-09
 */
public class ConditionDemo {
    public static void main(String[] args) {
        A a = new A();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                a.add();
            }

        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                a.sub();
            }

        }, "B").start();
    }

}


class A {
    public static int number = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void add() {
        lock.lock();
        try {
            while(number!=0){
                condition.await();//对应Object的wait()；
            }
            number++;
            System.out.println(Thread.currentThread().getName()+">>"+number);
            condition.signalAll();//对应Object的notifyAll()。

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void sub() {
        lock.lock();
        try {
            while(number!=1){
                condition.await();//对应Object的wait()；
            }
            number--;
            System.out.println(Thread.currentThread().getName()+">>"+number);
            condition.signalAll();//对应Object的notifyAll()。

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


}
