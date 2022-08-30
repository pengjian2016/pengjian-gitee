package guava;

import com.google.common.collect.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author pengjian
 * @since 2022-08-26
 */
public class GavaDemo {

    @Test
    public void test() {
        ImmutableList<Integer> of = ImmutableList.of(1, 2, 3, 4, 5);
        System.out.println(of);
        ImmutableSet<Integer> of1 = ImmutableSet.of(1, 2, 3, 4, 5);

        ImmutableMap<String, String> of2 = ImmutableMap.of("1", "2", "3", "4", "5", "6");
    }

    @Test
    public void test2() {
        HashMap<String, List<Integer>> stringListHashMap = new HashMap<>();
        Multimap<String, Integer> map = ArrayListMultimap.create();
        map.put("aa", 1);
        map.put("aa", 2);
        System.out.println(map);
    }


}
