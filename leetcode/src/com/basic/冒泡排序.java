package com.basic;

import java.util.Arrays;

/**
 * @author pengjian
 * @since 2022-05-05
 */
public class 冒泡排序 {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 7, 9, 5, 8,0,3};
        bubbleSort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    private static void bubbleSort(int[] nums) {
        boolean hasChange = true;
        int size = nums.length;
        for (int i = 0 ; i < size - 1 && hasChange; ++i) {
            hasChange = false;
            for (int j = 0; j < size - i - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    hasChange = true;
                }
            }
        }
    }

    private static void bubbleSort2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                System.out.println(i+"--"+j);
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }



}
