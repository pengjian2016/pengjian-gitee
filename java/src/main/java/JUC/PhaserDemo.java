package JUC;

import java.util.Random;
import java.util.concurrent.Phaser;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class PhaserDemo {

    private static TravelPhaser travelPhaser = new TravelPhaser();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            travelPhaser.register();
            Thread thread = new Thread(new Colleague(travelPhaser), "同事" + i);
            thread.start();

        }
    }


}

class TravelPhaser extends Phaser{

    protected boolean onAdvance(int phase, int registry) {
        switch (phase) {
            // 第1阶段，旅游前的集合
            case 0:
                System.out.println("出发前小组人员集合完毕，总人数："+getRegisteredParties());
                return false;
            // 第2阶段，景点 A 游玩
            case 1:
                System.out.println("景点 A 游玩结束");
                return false;
            // 第3阶段，景点 B 游玩
            case 2:
                System.out.println("景点 B 游玩结束");
                return false;
            // 第4阶段，旅游结束返程集合
            case 3:
                System.out.println("所有活动结束后小组人员集合完毕，总人数："+getRegisteredParties());
                return true;
            default:
                return true;


        }

    }
}


class Colleague implements Runnable{
    private TravelPhaser travelPhaser;

    public Colleague(TravelPhaser travelPhaser) {
        this.travelPhaser = travelPhaser;
    }

    @Override
    public void run() {
        sleep();
        System.out.println(Thread.currentThread().getName() + "到达出发集合地");
        travelPhaser.arriveAndAwaitAdvance();

        sleep();
        System.out.println(Thread.currentThread().getName() + "已经在景点 A 自由活动结束");
        travelPhaser.arriveAndAwaitAdvance();

        sleep();
        System.out.println(Thread.currentThread().getName() + "已经在景点 B 自由活动结束");
        travelPhaser.arriveAndAwaitAdvance();

        sleep();
        System.out.println(Thread.currentThread().getName() + "到达返程集合地");
        travelPhaser.arriveAndAwaitAdvance();
    }

    private void sleep() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (Exception e) {}
    }
}