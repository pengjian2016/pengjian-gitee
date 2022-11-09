package 抢票;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class 抢票2 {
    private static AtomicInteger num = new AtomicInteger(100);

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            TicketOffice ticketOffice = new TicketOffice(num, i);
            // 每个售票窗口开始售票
            new Thread(ticketOffice).start();
        }
    }

}



class TicketOffice  implements Runnable {
    // 当前可售的总票数
    private AtomicInteger currentTicketCount;
    // 窗口名称（编号）
    private String ticketOfficeNo;
    // 售票窗口构造函数
    public TicketOffice(AtomicInteger currentTicketCount, int ticketOfficeNo) {
        this.currentTicketCount = currentTicketCount;
        this.ticketOfficeNo = "第" + ticketOfficeNo + "售票窗口";
    }
    // 模拟售票逻辑
    public void run() {
        // 模拟不间断的售票工作（生活中有工作时间段控制）
        while (true) {
            // 获取当前可售的总票数，如果没有余票就关闭当前售票窗口结束售票，否则继续售票
            if (currentTicketCount.get() < 1) {
                System.out.println("票已售完，" + ticketOfficeNo + "结束售票");
                return;
            }
            // 模拟售票用时
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (Exception e) {}

            // 当总票数减1后不为负数时，出票成功
            int ticketIndex = currentTicketCount.decrementAndGet();
            if (ticketIndex >= 0) {
                System.out.println(ticketOfficeNo + "已出票，还剩" + ticketIndex + "张票");
            }
        }
    }
}
