package com.yaoding.fundamental.sort;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * 插入排序算法实现
 * 插入排序的思路：
 * 一个随机序列有限数组, 从第一个字符开始默认是有序的，用新来的值与之前有序的数组进行比较
 * 如果待比较的值比有序的数组中的值小， 就跟当前值交换， 然后继续遍历，直到找到比当前值大的位置
 */
public class InsertSort extends Sort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exch(arr, j, j-1);
            }
        }
    }
}



