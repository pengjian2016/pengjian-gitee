package basic;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-02-06
 */
public class 位移Test {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("初始数据： " + i);
        System.out.println("初始数据对应的二进制字符串： " + Integer.toBinaryString(i));

        i <<= 10;
        System.out.println("左移 10 位后的数据 " + i);
        System.out.println("左移 10 位后的数据对应的二进制字符 " + Integer.toBinaryString(i));

        int j = 1;
        System.out.println("初始数据： " + j);
        System.out.println("初始数据对应的二进制字符串： " + Integer.toBinaryString(j));

        j <<= 10;
        System.out.println("左移 10 位后的数据 " + j);
        System.out.println("左移 10 位后的数据对应的二进制字符 " + Integer.toBinaryString(j));
    }

}
