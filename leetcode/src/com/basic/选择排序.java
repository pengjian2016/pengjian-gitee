package com.basic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pengjian
 * @since 2022-11-02
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第 2 步，直到所有元素均排序完毕。
 */
public class 选择排序 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,7,8,9,6,4,1,9,5,23,99};
        System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));
        System.out.println("");
        selectionSort(arr);
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;//起始位置
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;//计数位置
                }
            }
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
            System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));
        }
    }


}
