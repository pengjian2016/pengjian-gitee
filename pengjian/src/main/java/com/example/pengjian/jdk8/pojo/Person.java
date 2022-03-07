package com.example.pengjian.jdk8.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author pengjian
 * @since 2022-03-07
 */
@Data
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private int salary;
    private int age;
    private String sex;
    private String area;
}
