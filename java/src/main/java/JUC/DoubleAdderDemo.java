package JUC;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.atomic.DoubleAdder;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-08
 */
public class DoubleAdderDemo {
    @Test
    public void test(){
        DoubleAdder doubleAdder = new DoubleAdder();
        // 调用累加方法
        doubleAdder.add(50.5);
        doubleAdder.add(49.5);
        double sum = doubleAdder.sum();
        System.out.println(sum);

    }

    // 首先创建三个 DoubleAdder 对象分别表示统计结果
    // 代表当天所有进入商场的男性客户总数量
    private static DoubleAdder maleCount = new DoubleAdder();
    // 代表当天所有进入商场的女性客户总数量
    private static DoubleAdder womenCount = new DoubleAdder();
    // 代表当天所有进入商场的未能识别的客户总数量
    private static DoubleAdder unknownGenderCount = new DoubleAdder();
    public static void main(String[] args) {
        // 定义30个商场入口检测设备
        for (int i = 1; i <= 5; i++) {
            MonitoringDevice monitoringDevice = new MonitoringDevice(maleCount, womenCount, unknownGenderCount, i);
            // 开启检测设备进行检测
            new Thread(monitoringDevice).start();
        }

    }

}

class  MonitoringDevice implements Runnable {
    private DoubleAdder maleCount;
    private DoubleAdder womenCount;
    private DoubleAdder unknownGenderCount;

    private String monitoringDeviceNo;

    public MonitoringDevice(DoubleAdder maleCount, DoubleAdder womenCount, DoubleAdder unknownGenderCount, int monitoringDeviceNo) {
        this.maleCount = maleCount;
        this.womenCount = womenCount;
        this.unknownGenderCount = unknownGenderCount;
        this.monitoringDeviceNo = "第" + monitoringDeviceNo + "监控采集处";
    }

    @Override
    public void run() {
        while (true) {
            // 监测处理 (监测设备输出1代表男性，0代表女性，其他代表未能识别，此处随机产生监测结果)
            try {
                Thread.sleep(new Random().nextInt(3000));
            } catch (Exception e) {}
            int monitoringDeviceOutput = new Random().nextInt(3);
            // 对监测结果进行统计
            switch (monitoringDeviceOutput) {
                case 0: womenCount.add(1);
                    System.out.println("统计结果: womenCount=" + womenCount.sum());
                    break;
                case 1: maleCount.add(1);
                    System.out.println("统计结果: maleCount=" + maleCount.sum());
                    break;
                default: unknownGenderCount.add(1);
                    System.out.println("统计结果: unknownGenderCount=" + unknownGenderCount.sum());
                    break;
            }
        }
    }
}