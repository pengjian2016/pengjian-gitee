package basic;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * TODO
 *
 * @author pengjian
 * @since 2023-02-07
 */
public class 异常Test {

    @Test
    public void test1(){
        try {
            System.out.println("Try to do something");
            throw new RuntimeException("RuntimeException");
        } catch (Exception e) {
            System.out.println("Catch Exception -> " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
    @Test
    public void test2(){
        System.out.println(f(2));
    }

    private static int f(int value) {
        try {
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }

    @Test
    public void test3(){
        //读取文本文件的内容
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D://read.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }


    @Test
    public void test4() {
        try (Scanner scanner = new Scanner(new File("text.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
