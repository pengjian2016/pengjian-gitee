package com.example.pengjian.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-09-30
 */
public class DateDemo {
    //Instant 代表的是时间戳
    //LocalDate 代表日期，比如 2020-01-14
    //LocalTime 代表时刻，比如 12:59:59
    //LocalDateTime 代表具体时间 2020-01-12 12:22:26
    //ZonedDateTime 代表一个包含时区的完整的日期时间，偏移量是以 UTC/  格林威治时间为基准的
    //Period	 代表时间段
    //ZoneOffset	 代表时区偏移量，比如：+8:00
    //Clock	 代表时钟，比如获取目前美国纽约的时间
    @Test
    public void test1() {
        System.out.println(Instant.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

    }

    @Test
    public void test2() {
        String str = "2019-01-11";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(str, formatter);
        System.out.println(localDate);
    }
    //Date 转换 LocalDate
    @Test
    public void test3() {
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();

        // atZone()方法返回在指定时区从此Instant生成的ZonedDateTime。
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        System.out.println("Date = " + date);
        System.out.println("LocalDate = " + localDate);
    }

    //LocalDate 转 Date
    @Test
    public void test4() {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        ZonedDateTime zdt = localDate.atStartOfDay(zoneId);

        Date date = Date.from(zdt.toInstant());

        System.out.println("LocalDate = " + localDate);
        System.out.println("Date = " + date);

    }

}
