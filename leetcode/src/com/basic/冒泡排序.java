package com.basic;

import java.util.Arrays;

/**
 * @author pengjian
 * @since 2022-05-05
 * 比较相邻的元素， 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        //int[] arr = new int[10];
        //for (int i = 0; i < 10; i++) {
        //    arr[i] = (int) Math.round(Math.random() * 10 + 1);
        //}
        int[] arr = new int[]{3,7,8,9,6,4,1,9,5,23,99};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("");
        bobbleSort(arr);
    }

    public static void bobbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("");
            Arrays.stream(arr).forEach(System.out::print);
        }
    }


}
