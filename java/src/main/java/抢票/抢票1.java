package 抢票;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class 抢票1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        for (int i = 1; i < 5; i++) {
            new Thread(computer, "售票口" + i).start();
        }

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Map<String, List<Integer>> map = computer.map;
        System.out.println(map);
    }

}
class Votes{
    public static Integer num = 100;
}


class Computer implements Runnable {

    private Object lock = new Object();
    Map<String, List<Integer>> map = new ConcurrentHashMap<>();

    @Override

    public void run() {
        while (Votes.num > 0) {
            synchronized (lock) {
                if (Votes.num > 0) {
                    List<Integer> orDefault = map.getOrDefault(Thread.currentThread().getName(), new ArrayList<>());
                    orDefault.add(Votes.num);
                    System.out.println(Thread.currentThread().getName() + "卖出第: " + Votes.num + "张票。");
                    Votes.num--;
                }
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
