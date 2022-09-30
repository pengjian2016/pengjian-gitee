package com.example.pengjian.jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author pengjian
 * @since 2022-09-30
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    //名字
    private String name;
    //性别
    private String sex;
    //薪水
    private int salary;
    //年龄
    private int age;
    //星座
    private String star;
}