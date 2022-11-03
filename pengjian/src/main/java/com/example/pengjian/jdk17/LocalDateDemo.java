package com.example.pengjian.jdk17;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * TODO
 *
 * @author pengjian
 * @since 2022-11-02
 */
@Slf4j
public class LocalDateDemo {

    //LocalDae 年月日
    //LocalTime 时分秒
    //localDateTime  年月日时分秒

    @Test
    public void tes1() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate of = LocalDate.of(2022, 10, 10);
        System.out.println(of);
    }

    @Test
    public void test2() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
    }

    @Test
    public void test3() {
        LocalDate now = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(now.getYear()+"==="+now.getDayOfYear());
        System.out.println(now.getMonthValue()+"==="+now.getDayOfMonth());
        System.out.println(now.getDayOfWeek()+"=="+now.getChronology());

        System.out.println("当前年的天数"+now.lengthOfYear());
        System.out.println("是否闰年"+now.isLeapYear());

    }

    @Test
    public void test4() {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.withDayOfMonth(1);
        LocalDate localDate1 = now.withDayOfYear(21);
        LocalDate localDate2 = now.withMonth(3);
        LocalDate localDate3 = now.withYear(2004);
        log.info("当月的指定日:" + localDate);
        log.info("获取今年第一月的指定日期:" + localDate1);
        log.info("今年指定月份，日为当天的日期:" + localDate2);
        log.info("指定年份的今天:" + localDate3);

    }

}
