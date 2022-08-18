package redis;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

/**
 * @author pengjian
 * @since 2022-08-18
 */
public class RedissonDemo {
    public static void main(String[] args) {
        RedissonClient redisClient = RedissonPoolUtils.getRedisClient();
        RedissonDemo demo = new RedissonDemo();
        demo.demo(redisClient);
        redisClient.shutdown();
    }

    private void demo(RedissonClient redisClient) {
        //简洁方法
        RLock lock = redisClient.getLock("key");
        lock.lock();

        //指定超时时间
        lock.lock(10, TimeUnit.SECONDS);
        try {
            boolean tryLock = lock.tryLock(100, 10, TimeUnit.SECONDS);
            if(tryLock) {
                try {
                    System.out.println("指定超时间");
                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //异步
        RLock anyLock = redisClient.getLock("anyLock");
        anyLock.lockAsync();
        anyLock.lockAsync(10, TimeUnit.SECONDS);




        RLock fairLock = redisClient.getFairLock("key");
        fairLock.lock();

    }
}
