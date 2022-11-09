package JUC;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class CyclicBarrierDemo {

    private static Runnable driver = new Runnable() {
        @Override
        public void run() {
            System.out.println("所有同学已经集合完毕，开始启动车辆出发。");
        }
    };

    static int threadCount = 5;
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(threadCount);

    public static void main(String[] args) {
        for (int i = 0; i < threadCount; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" 已经出门。。");

                    try {
                        Thread.sleep(new Random().nextInt(10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println( Thread.currentThread().getName() + "已经到达集合点");
                    // 等待其他同学到达集合点（等待其他线程到达屏障点）
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }

                }
            },i+"号同学").start();

        }
    }


    @Test
    public void test2() {
        /**
         * 集齐77个龙珠召唤神龙
         */
        // 召唤龙珠的线程
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, ()->{
            System.out.println("召唤神龙成功! ");
        });
        for (int i = 0; i < 15; i++) {
            int temp = i;
            //lambda 能拿到i吗
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "收集" + temp + "个龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },"线程"+i).start();
        }

    }
}
