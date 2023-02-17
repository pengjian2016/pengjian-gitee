package basic;

import org.testng.annotations.Test;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-02-06
 */
public class 可变长参数 {

    public static void print(String... strings) {
        for (String string : strings) {
            System.out.println("test1====" + string);
        }
    }

    public static void print(String arg1, String arg2) {
        System.out.println("test2====" + arg1 + arg2);
    }

    public static void main(String[] args) {
        print("a", "b");
        print("a", "b", "c", "d");
    }


    @Test
    public void test() {
        int num1 = 10;
        int num2 = 20;
        swap(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }

}
