package guava;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjian
 * @since 2022-08-26
 */
@Slf4j
public class ListsDemo {
    @Test
    public void test() {
        ArrayList<String> list = Lists.newArrayList("1","2");
        list.add("hello");
        list.add("world");
        list.remove("hello");
        System.out.println(list);
    }

    //list 分割
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        int size =99 ;
        List<List<Integer>> partition = Lists.partition(list, size);
        System.out.println(partition);
    }
    //list 转化
    @Test
    public void test2() {
        String str1 = "hello";
        String[] str2 = {"world", "world2", "world3"};
        List<String> stringList = Lists.asList(str1, str2);
        System.out.println(stringList);//[hello, world, world2, world3]

        //stringList.add("new Str");//java.lang.UnsupportedOperationException
        str2[0] = "this is a string";
        System.out.println(stringList);//[hello, this is a string, world2, world3]

        /**
         * transform：根据传进来的function对fromList进行相应的处理
         * 并将处理得到的结果存入到新的list对象中返回
         */
        List<String> transform = Lists.transform(stringList, new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        });
        System.out.println(transform);

        List<String> reverse = Lists.reverse(transform);
        System.out.println(reverse);

    }

}
