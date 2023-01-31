package 线程;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-01-06
 */
public class 线程依次执行 {

    public static void main(String[] args) {
        //
        //countDownLatch_demo();

        join_demo();

    }

    private static void join_demo() {
        Thread a = new Thread(() -> {
            System.out.println("A - 执行");
        });

        Thread b = new Thread(() -> {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B - 执行");
        });

        Thread c = new Thread(() -> {
            try {
                b.join();
            } catch (InterruptedException e) {
            }
            System.out.println("C - 执行");
        });

        a.start();
        b.start();
        c.start();
    }

    private static void countDownLatch_demo() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch aLatch = new CountDownLatch(1);
        CountDownLatch bLatch = new CountDownLatch(1);
        CountDownLatch cLatch = new CountDownLatch(1);

        executorService.submit(() -> {
            try {
                aLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A - 执行");
            bLatch.countDown();
        });


        executorService.submit(() -> {
            try {
                bLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B - 执行");
            cLatch.countDown();
        });


        executorService.submit(() -> {
            try {
                cLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C - 执行");
        });

        // a 可以不用等待，执行
        aLatch.countDown();
    }
}
