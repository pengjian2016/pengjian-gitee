package com.basic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pengjian
 * @since 2022-05-05
比较相邻的元素。如果第一个比第二个大，就交换它们两个；
对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
针对所有的元素重复以上的步骤，除了最后一个；
重复步骤 1~3，直到排序完成。
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,7,8,9,6,4,1,9,5,23,99};
        System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));
        System.out.println("");
        bobbleSort(arr);
    }
    public static void bobbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));
        }
    }


}
