package guava;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * @author pengjian
 * @since 2022-08-26
 */
public class JoinerDemo {

    @Test
    public void testJoiner() {
        Joiner joiner = Joiner.on("==").skipNulls();
        String join = joiner.join("a", "b", "c");
        System.out.println(join);
        String join1 = joiner.join("a", "b", "c", "d");
        System.out.println(join1);
    }

    @Test
    public void testJoiner2() {
        HashMap<@Nullable Object, @Nullable Object> map = Maps.newHashMap();
        map.put("a", "b");
        map.put("b", "c");
        String join = Joiner.on(",").withKeyValueSeparator("==").join(map);
        System.out.println(join);
    }
}

