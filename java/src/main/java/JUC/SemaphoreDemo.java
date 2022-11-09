package JUC;

import org.testng.annotations.Test;

import java.util.concurrent.Semaphore;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class SemaphoreDemo {


    @Test
    public void test1() {
        Semaphore semaphore = new Semaphore(1);
        //semaphore.acquire();//使用许可
        //semaphore.release();//释放


    }


    private  static  Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Person person = new Person(semaphore, i);
            new Thread(person).start();
        }

    }

}

class Person implements  Runnable{
    Semaphore semaphore;
    String name;

    public Person(Semaphore semaphore, int name) {
        this.semaphore = semaphore;
        this.name = "旅客" + name;;
    }

    @Override
    public void run() {
        try {
            // 请求获得信号量，就是请求（寻找）是否有可用的闸机
            semaphore.acquire();
            int i = semaphore.availablePermits();
            System.out.println("当前可用闸机数" + i);
            boolean hasQueuedThreads = semaphore.hasQueuedThreads();
            System.out.println("当前是否有旅客等待闸机进站："+hasQueuedThreads);
            // 已经等到了可用闸机
            System.out.println(this.name + "已经占有一台闸机");
            // 进站
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 已经进站
            System.out.println(this.name + "已经进站");
            // 让出闸机给别人用
            semaphore.release();
        }



    }
}