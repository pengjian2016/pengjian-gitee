package com.basic;

/**
 * @author pengjian
 * @since 2022-08-19
 * 待查找的有序序列，每次从中间位置与待查找的关键字对比，如果中间位置的>查找关键字 前半部分循环这个查找过程
 */
public class 二分查找法 {
    public static void main(String[] args) {
        int[] srcArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int des = 4;
        System.out.println(bigarySearch(srcArray, des));
    }
    /**
     * @param srcArray 原数组
     * @param des 目标查找
     * @return 返回查找到的索引位置，找不到-1
     */
    public static int bigarySearch(int[] srcArray, int des) {
        //定义初始最大 最小索引位置
        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            //中间索引位置
            int mid = (start + end) / 2;
            if (srcArray[mid] == des) {
                return mid;
            } else if (srcArray[mid] < des) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
