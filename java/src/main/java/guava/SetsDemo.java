package guava;

import com.google.common.collect.Sets;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;


/**
 * @author pengjian
 * @since 2022-08-26
 */
public class SetsDemo {
    @Test
    public void test1() {
        Set<String> set = Sets.newHashSet("a", "b", "c");
        System.out.println(set);
        HashSet<String> strings = Sets.newHashSet("1", "2", "a");
        System.out.println(strings);

        //差异
        Sets.SetView<String> difference = Sets.difference(set, strings);
        System.out.println(difference);
        //交集
        Sets.SetView<String> intersection = Sets.intersection(set, strings);
        System.out.println(intersection);
        //并集
        Sets.SetView<String> union = Sets.union(set, strings);
        System.out.println(union);
    }
}
