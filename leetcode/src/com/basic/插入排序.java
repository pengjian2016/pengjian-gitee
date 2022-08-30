package com.basic;

/**
 * @author pengjian
 * @since 2022-08-19
 * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入。
 */
public class 插入排序 {
    public static void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            //插入 的数
            int insertVal = arr[i];
            //被插入的位置
            int index = i - 1;
            //插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = insertVal;
        }
    }

}
