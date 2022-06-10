package com.example.pengjian;

import cn.hutool.core.convert.Convert;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

/**
 * @author pengjian
 * @since 2022-04-06
 */
public class Demo {
    public static void main(String[] args) {
        String str = "{\"time\":-1316505600000}";
        Object parse = JSONObject.parse(str);
        System.out.println(parse);

        Number bigDecimal = new BigDecimal(10);
        String s = Convert.digitToChinese(bigDecimal.doubleValue());
        System.out.println(s);
    }
}
