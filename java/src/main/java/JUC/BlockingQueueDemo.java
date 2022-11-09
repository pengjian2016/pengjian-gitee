package JUC;

import com.google.common.base.Stopwatch;
import org.testng.annotations.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-09
 */
public class BlockingQueueDemo {


    // 添加   移除      判断队列首部
    //add()  remove()  element()         //抛出异常
    //offer() poll()   peek()       //不抛出异常 有返回   或者超时等待
    //put()   take()               //阻塞


    @Test
    public void test() throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.add("a"));
        System.out.println(queue.add("b"));
        System.out.println(queue.add("c"));
        //System.out.println(queue.add("d"));     //java.lang.IllegalStateException: Queue full

        //queue.put("d");//阻塞

        Stopwatch stopwatch = Stopwatch.createStarted();
        //TimeUnit.SECONDS.sleep(3);
        TimeUnit.MINUTES.sleep(1);

        System.out.println(stopwatch.elapsed(TimeUnit.MINUTES));



    }

}
