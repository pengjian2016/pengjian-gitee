package 线程;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pengjian
 * @since 2023-01-06
 */
public class 线程同时执行 {
    public static void main(String[] args){
        //有A,B,C三个线程，如何保证三个线程同时执行
        countDownLatch_demo();

    }
    //有A,B,C三个线程，如何保证三个线程同时执行
    private static void countDownLatch_demo() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        executorService.submit(() -> {
            StopWatch started = StopWatch.createStarted();
            try {
                countDownLatch.await();//阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            started.stop();
            System.out.println("线程A执行，执行时间：" + started.getTime(TimeUnit.MILLISECONDS));
        });

        executorService.submit(()->{

            StopWatch started = StopWatch.createStarted();
            try {
                countDownLatch.await();//阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            started.stop();
            System.out.println("线程B执行，执行时间：" + started.getTime(TimeUnit.MILLISECONDS));

        });

        executorService.submit(()->{

            StopWatch started = StopWatch.createStarted();
            try {
                countDownLatch.await();//阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            started.stop();
            System.out.println("线程C执行，执行时间：" + started.getTime(TimeUnit.MILLISECONDS));
        });

        countDownLatch.countDown();
    }


}
