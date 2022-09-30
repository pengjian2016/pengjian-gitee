package guava;

import com.google.common.collect.*;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



    @Test
    public void test3() {
        List<Integer> list = Lists.newArrayList(1,2,3);
        List<Integer> list1 = Collections.unmodifiableList(list);
        List<Integer> list2 =Lists.newArrayList(list);
        // [1, 2, 3]
        System.out.println(list);
        // [1, 2, 3]
        System.out.println(list1);
        // list修改，list1也会被修改
        list.add(4);
        // [1, 2, 3, 4]
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }

    @Test
    public void test4() {
        List<String> words = Lists.newArrayList("a", "b", "c", "a");
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = counts.get(word);
            if (count == null) {
                counts.put(word, 1);
            } else {
                counts.put(word, count + 1);
            }
        }
        System.out.println(counts);

        HashMultiset<String> objects = HashMultiset.create();
        for (String word : words) {
            objects.add(word);
        }
        System.out.println(objects.count("a"));

    }



    @Test
    public void test5() {
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("name", "Jack");
        multimap.put("name", "Jack");
        multimap.put("name", "Tom");
        multimap.put("age", "10");
        multimap.put("age", "12");
        System.out.println(multimap);
        System.out.println(multimap.get("name").size());
    }

}
