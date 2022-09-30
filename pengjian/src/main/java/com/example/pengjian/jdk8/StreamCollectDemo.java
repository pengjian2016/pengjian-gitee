package com.example.pengjian.jdk8;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-09-30
 */
public class StreamCollectDemo {
    public static List<Student> list = Arrays.asList(
            new Student("九天", "男", 5000, 18, "天秤座"),
            new Student("十夜", "男", 4000, 16, "双鱼座"),
            new Student("十一郎", "男", 3000, 24, "水瓶座"),
            new Student("十二郎", "男", 3000, 24, "水瓶座")
    );
    //collect: groupingBy(Function)
    @Test
    public void test1(){
        Map<Integer,List<Student>> result = list.stream().collect(Collectors.groupingBy(Student::getAge));
        for (Integer age:result.keySet()){
            System.out.println(result.get(age));
        }
    }

    //collect：groupingBy(Function, Collector)
    @Test
    public void test2(){
        // 先分组，在计算每组的个数
        Map<Integer,Long> num = list.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.counting()));
        System.out.println(num);
    }
    //collect：groupingBy(Function, Supplier, Collector)
    @Test
    public void test3(){
        // 先分组，在计算每组的个数,然后排序
        Map<Integer,Long> num = list.stream().collect(Collectors.groupingBy(Student::getAge, TreeMap::new,Collectors.counting()));
        System.out.println(num);
    }
    //collect：joining()
    @Test
    public void test4(){
        // 名字拼接
        String result = list.stream().map(Student::getName).collect(Collectors.joining("=="));
        System.out.println(result);
    }

    //collect：joining(str, prefix, suffix)
    @Test
    public void test5(){
        // 名字拼接,包含前缀、后缀
        String result = list.stream().map(Student::getName).collect(Collectors.joining(",","hello","world"));
        System.out.println(result);
    }
    //collect：summarizingDouble
    @Test
    public void test6(){
        // 求年龄的最大值、最小值、平均值、综合以及人数
        DoubleSummaryStatistics result = list.stream().collect(Collectors.summarizingDouble(Student::getAge));
        System.out.println(result.getAverage());
        System.out.println(result.getMax());
    }
}
