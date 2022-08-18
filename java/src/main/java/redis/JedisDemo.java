package redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author pengjian
 * @since 2022-08-18
 */
public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = JedisPoolUtils.getJedis();
        JedisDemo demo = new JedisDemo();
        demo.demo(jedis);
        jedis.close();
    }

    private void demo(Jedis jedis) {
        System.out.println("======key=======");
        jedis.select(1);
        jedis.set("key1", "value11");
        jedis.set("key2", "value21");
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            String s = jedis.get(key);
            System.out.println(key + "=" + s);
        }
        System.out.println("==================");
        Boolean key1 = jedis.exists("key1");
        System.out.println(key1);
        Boolean keyOther = jedis.exists("key2020");
        System.out.println(keyOther);


    }
}
