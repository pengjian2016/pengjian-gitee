package JUC;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class CountDownLatchDemo {

    static int threadCount = 5;
    private static CountDownLatch countDownLatch = new CountDownLatch(threadCount);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < threadCount; i++) {
            // 开始报表子线程处理
            new Thread(new Runnable() {
                public void run() {
                    // 模拟报表数据计算时间
                    try {
                        Thread.sleep(new Random().nextInt(5000));
                    } catch (Exception e) {}
                    System.out.println( Thread.currentThread().getName() + "已经处理完毕");
                    countDownLatch.countDown();
                }
            }, "报表子线程" + i).start();
        }
        // 主线程等待所有子线程运行完毕后输出报表文件
        countDownLatch.await();
        System.out.println("报表数据已经全部计算完毕，开始生成报表文件...");

    }


    @Test
    public void test1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"==> start");
                countDownLatch.countDown();
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"线程"+i).start();
        }
        countDownLatch.await();//// 等待计数器归零,然后再向下执行
        System.out.println("main线程继续向下执行");
    }
}
