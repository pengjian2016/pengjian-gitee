package com.example.pengjian.jdk8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.Test;

import com.example.pengjian.jdk8.pojo.Person;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class StreamDemo {
    //获取String集合中最长的元素 最短
    @Test
    public void maxTest() {
        List<String> stringList = Arrays.asList("ssx", "mike", "algorithm", "handsome", "hzBank");
        stringList.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
        stringList.stream().max(Comparator.comparing(String::length).reversed()).ifPresent(System.out::println);
    }

    //获取Integer集合中最大值
    @Test
    public void maxTest2() {
        List<Integer> integers = Arrays.asList(1, 50, 20, 15, 35);
        //自然排序
        integers.stream().max(Integer::compareTo).ifPresent(System.out::println);

        //自定义排序
        integers.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).ifPresent(System.out::println);

        integers.stream().max((o1,o2)->o2-o1).ifPresent(System.out::println);

    }

    //做高工资的人
    @Test
    public void maxSalary() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        personList.stream().max(Comparator.comparing(Person::getSalary))
                .ifPresent(person -> System.out.println(person.getName()+"--"+person.getSalary()));

    }

    //计算Integer集合中大于 6 的元素的个数。
    @Test
    public void countTest() {
        List<Integer> integers = Arrays.asList(1, 2, 15, 62, 32, 5);
        System.out.println(integers.stream().filter(x -> x > 6).count());
        integers.stream().filter(x -> x > 6).forEach(System.out::println);
    }

    @Test
    public void collectTest() {
        List<Integer> list = Arrays.asList(1, 1, 5, 6, 6, 15, 8, 8);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        Set<Integer> collect1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect1);

    }

    @Test
    public void collectTest2() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(Person.builder().name("A").salary(7000).build());
        personList.add(Person.builder().name("B").salary(8000).build());
        personList.add(Person.builder().name("C").salary(9000).build());

        Map<String, Person> collect = personList.stream().filter(person -> person.getSalary() > 7000).collect(Collectors.toMap(Person::getName, Function.identity()));
        System.out.println(collect);

        Map<String, Integer> collect1 = personList.stream().filter(person -> person.getSalary() > 7000).collect(Collectors.toMap(Person::getName, Person::getSalary));
        System.out.println(collect1);

        personList.add(Person.builder().name("C").salary(10000).build());
        Map<String, Integer> collect2 = personList.stream().collect(Collectors.toMap(Person::getName, Person::getSalary, (oldVal, currVal)->currVal));
        System.out.println(collect2);


        Map<String, List<Person>> collect3 = personList.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println(collect3);
    }

    //英文字符串数组的元素全部改为大写。整数数组每个元素+3。
    @Test
    public void  mapTest() {
        List<String> stringList = Arrays.asList("abcd", "bcdd", "defde", "fTr");
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);

    }

    //将员工的薪资全部增加 1000。
    @Test
    public void mapTest2(){
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        //不改变原集合
        List<Person> newCollect = personList.stream().map(person -> Person.builder().name(person.getName())
                .salary(person.getSalary() + 1000)
                .age(person.getAge())
                .sex(person.getSex())
                .area(person.getArea()).build()
        ).collect(Collectors.toList());
        System.out.println("---------");
        newCollect.stream().forEach(System.out::println);
        System.out.println("---------");
        personList.stream().forEach(System.out::println);

        //改变原集合
        List<Person> personList2 = personList.stream().map(person -> {
            person.setSalary(person.getSalary() + 1000);
            return person;
        }).collect(Collectors.toList());
        System.out.println("---------");
        personList2.stream().forEach(System.out::println);
    }

    //求Integer集合的元素之和、乘积和最大值。
    @Test
    public void reduceTest(){
        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        //求和法1
        Optional<Integer> sum1 = list.stream().reduce((x, y) -> x + y);
        //求和法2
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);

        //求乘积
        Optional<Integer> product = list.stream().reduce((x, y) -> x * y);

        //求最大值
        Optional<Integer> max = list.stream().reduce((x, y) -> x > y ? x : y);

        Optional<Integer> max2 = list.stream().max(Comparator.naturalOrder());

        System.out.println(sum1.get());
        System.out.println(sum2.get());
        System.out.println(product.get());
        System.out.println(max.get());
        System.out.println(max2.get());
    }

}
