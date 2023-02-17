package basic;

import org.testng.annotations.Test;

/**
 *如果字符串常量池中保存了对应的字符串对象的引用，就直接返回该引用。
 * 如果字符串常量池中没有保存了对应的字符串对象的引用，那就在常量池中创建一个指向该字符串对象的引用并返回。
 * @author pengjian
 * @since 2023-02-06
 */
public class StringTest {

    @Test
    public void test0(){
        // 将字符串对象”ab“的引用保存在字符串常量池中
        String str1 = "ab";
        // 直接返回字符串常量池中字符串对象”ab“的引用
        String str2 = "ab";
        System.out.println(str1 == str2);//true

    }

    @Test
    public void test1(){
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false
    }
    @Test
    public void test1_1(){
        final String str1 = "str";
        final String str2 = "ing";
// 下面两个表达式其实是等价的
        String c = "str" + "ing";// 常量池中的对象
        String d = str1 + str2; // 常量池中的对象
        System.out.println(c == d);// true
    }
    @Test
    public void test1_2(){
        final String str1 = "str";
        final String str2 = getStr();
        String c = "str" + "ing";// 常量池中的对象
        String d = str1 + str2; // 在堆上创建的新的对象
        System.out.println(c == d);// false
    }
    public static String getStr() {
        return "ing";
    }



    @Test
    public void test2(){
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        System.out.println(aa == bb);// true
        System.out.println(a == b);// false
        System.out.println(a.equals(b));// true
        System.out.println(42 == 42.0);// true

    }



    public static void main(String[] args) {
        // 将字符串对象”Java“的引用保存在字符串常量池中
        String s1 = "java";
        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s2 = s1.intern();
        // 会在堆中在单独创建一个字符串对象
        String s3 = new String("java");
        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s4 = s3.intern();

        // s1 和 s2 指向的是堆中的同一个对象
        System.out.println(s1 == s2);//true

        // s3 和 s4 指向的是堆中不同的对象
        System.out.println(s3== s4);//false

// s1 和 s4 指向的是堆中的同一个对象
        System.out.println(s2== s4);//true



    }



}
