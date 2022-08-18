package redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @author pengjian
 * @since 2022-08-18
 */
public class RedissonPoolUtils {
    private static RedissonClient redisClient = null;

    static {
        Config  config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        redisClient = Redisson.create(config);
    }

    public static RedissonClient getRedisClient() {
        return redisClient;
    }
}
