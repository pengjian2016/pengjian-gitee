package guava;

import com.google.common.collect.*;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

/**
 * @author pengjian
 * @since 2022-08-26
 */
public class MapsDemo {
    @Test
    @SneakyThrows
    public static void test(String[] args) {
        Map<String, String> map = Maps.newHashMap();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Map<String, String> map2 = Maps.newHashMap();
        map2.put("a", "1");
        map2.put("b", "2");
        map2.put("c2", "3");
        MapDifference<String, String> difference = Maps.difference(map, map2);

        System.out.println(difference);
        Map<String, String> map1 = difference.entriesInCommon();
        Map<String, String> map3 = difference.entriesOnlyOnLeft();
        Map<String, String> map4 = difference.entriesOnlyOnRight();
        System.out.println(map1);
        System.out.println(map3);
        System.out.println(map4);


        Properties properties = new Properties();
        properties.load(new FileInputStream("E:\\IDEA_workspace\\pengjian-gitee\\java\\src\\main\\resources\\redis.properties"));
        ImmutableMap<String, String> stringStringImmutableMap = Maps.fromProperties(properties);
        System.out.println(stringStringImmutableMap);

    }

    @Test
    public void test1(){
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("key1", "value1");
        biMap.put("key2", "value2");
        System.out.println(biMap);


    }
}
