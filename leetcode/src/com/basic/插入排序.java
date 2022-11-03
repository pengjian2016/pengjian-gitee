package com.basic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pengjian
 * @since 2022-08-19
从第一个元素开始，该元素可以认为已经被排序；
取出下一个元素，在已经排序的元素序列中从后向前扫描；
如果该元素（已排序）大于新元素，将该元素移到下一位置；
重复步骤 3，直到找到已排序的元素小于或者等于新元素的位置；
将新元素插入到该位置后；
重复步骤 2~5。
 */
public class 插入排序 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,7,8,9,6,4,1,9,5,23,99};
        System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));
        System.out.println("");
        insertionSort(arr);
    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int preIndex = i - 1;

            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex+1]=arr[preIndex];
                preIndex -= 1;
            }
            arr[preIndex + 1] = current;

            System.out.println(IntStream.of(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));
        }
    }


}
