package com.example.pengjian.jdk8;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-09-30
 */
public class StreamDemo {

    public static List<Student> list = Arrays.asList(new Student("九天", "男", 5000, 18, "天秤座"),
            new Student("十夜", "男", 4000, 16, "双鱼座"),
            new Student("十一郎", "男", 3000, 24, "水瓶座")
    );

    @Test
    public void test0() {
        list.stream();
    }

    //forEach 遍历
    @Test
    public void test1() {
        list.forEach(System.out::println);
    }

    //filter 过滤
    @Test
    public void test2() {
        list.stream().filter((e) -> e.getStar().equals("天秤座")).forEach(System.out::println);
    }

    //map 转换集合
    @Test
    public void test3() {
        List<String> names = list.stream().map(Student::getName).collect(Collectors.toList());
        names.stream().forEach(System.out::println);

        Map<String, Object> map = new HashMap<>();
        map.put("key1","1");
        map.put("key2","1");
        map.put("key3","1");
        map.put("key4","1");
        List<String> cidList = map.keySet().stream().map(String::toString).collect(Collectors.toList());
        System.out.println(cidList);
    }

    //mapToInt 转换数值流  mapToLong、mapToDouble，取最大值
    @Test
    public void test4() {
        IntStream intStream = list.stream().mapToInt(Student::getAge);
        Stream<Integer> integerStream = intStream.boxed();
        Optional<Integer> max   = integerStream.max(Integer::compareTo);
        System.out.println(max.get());

        Integer integer = list.stream().mapToInt(Student::getAge).boxed().max(Comparator.comparing(Integer::byteValue)).get();
        System.out.println(integer);
    }

    //flatMap 合并成一个流
    @Test
    public void test5() {
        List<String> list2 = new ArrayList<>();
        list2.add("aaa bbb ccc");
        list2.add("ddd eee fff");
        list2.add("ggg hhh iii");
        list2 = list2.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(list2);
    }

    //distinct 去重
    @Test
    public void test6() {
        List<String> list2 = new ArrayList<>();
        list2.add("aaa bbb ccc");
        list2.add("ddd eee fff");
        list2.add("ggg hhh iii");
        list2.add("ggg hhh iii");
        list2.stream().distinct().forEach(System.out::println);
        //复杂去重，根据字段
        //List<RedPacketRecord> newList = records.stream()
        //        .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(RedPacketRecord::getRoomId))), ArrayList::new));
    }

    //sorted 排序
    @Test
    public void test7() {
        //asc排序
        list.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");
        //desc排序
        list.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).forEach(System.out::println);
    }

    //skip 跳过前 n 个
    @Test
    public void test8() {
        list.stream().skip(1).forEach(System.out::println);
    }

    //limit 截取前 n 个
    @Test
    public void test10() {
        list.stream().limit(1).forEach(System.out::println);
    }


    //anyMatch  只要有其中任意一个符合条件
    @Test
    public void test11() {
        boolean isHave = list.stream().anyMatch(student -> student.getAge() == 16);
        System.out.println(isHave);
    }

    //allMatch 全部符合
    @Test
    public void test12() {
        boolean isHave = list.stream().allMatch(student -> student.getAge() == 16);
        System.out.println(isHave);
    }

    //、noneMatch 是否满足没有符合的
    @Test
    public void test13() {
        boolean isHave = list.stream().noneMatch(student -> student.getAge() == 16);
        System.out.println(isHave);
    }

    //findAny
    //找到其中一个元素 （使用 stream () 时找到的是第一个元素；使用 parallelStream () 并行时找到的是其中一个元素）
    @Test
    public void test14() {
        Optional<Student> student = list.stream().findAny();
        System.out.println(student.get());
    }

    //findFirst 找到第一个元素
    @Test
    public void test15() {
        Optional<Student> student = list.stream().findFirst();
        System.out.println(student.get());
    }

    //iterate
    @Test
    public void test20() {
        List<String> list = Arrays.asList("a", "b", "c", "c", "d", "f", "a");
        Stream.iterate(0, i -> i + 1).limit(list.size()).forEach(i -> {
            System.out.println(String.valueOf(i) + list.get(i));
        });
    }
    //collect：averagingLong 求平均值
    @Test
    public void test21(){
        // 求年龄平均值
        Double average = list.stream().collect(Collectors.averagingLong(Student::getAge));
        System.out.println(average);
    }

    //collect：collectingAndThen 两步结束，先如何，在如何
    @Test
    public void test22(){
        // 求年龄平均值
        String average = list.stream().collect(Collectors.collectingAndThen(Collectors.averagingInt(Student::getAge), a->"哈哈，平均年龄"+a));
        System.out.println(average);
    }

    //collect：counting 求个数
    @Test
    public void test23(){
        // 求数量
        Long num = list.stream().collect(Collectors.counting());
        System.out.println(num);
    }
}
