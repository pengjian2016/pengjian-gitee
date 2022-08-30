package com.example.seckill.common.encrypt;

import java.util.Base64;

public class Base64Encoder {
    public static String getBASE64(String s) {
        if (s == null)
            return null;

        return new String(Base64.getEncoder().encode(s.getBytes()));

    }

    // 将 BASE64 编码的字符串 s 进行解码   解密
    public static String getFromBASE64(String s) {
        if (s == null)
            return null;
        try {
            byte[] b = Base64.getDecoder().decode(s);
            return new String(b);
        } catch (Exception e) {
            return null;
        }
    }

    public static String mTOa(Object ming) {
        return Base64Encoder.getBASE64(Base64Encoder.getBASE64(Base64Encoder.getBASE64((String) ming)));
    }

    public static String aTOm(String an) {
        return Base64Encoder.getFromBASE64(Base64Encoder.getFromBASE64(Base64Encoder.getFromBASE64(an)));
    }

    public static void main(String[] args) {
        String a = mTOa("爪哇笔记".toString());
        System.out.println(a);//加密
        System.out.println(aTOm(a));//解密
    }

}
