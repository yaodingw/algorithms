package com.yaoding.fundamental.sort;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * 选择排序
 * 从第一个开始遍历，默认遍历的第一个数是最小值，然后遍历后面的数组，找是否有比假设的最小值还要小的值
 */
public class SelectionSort extends Sort {
    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr[j], arr[minIndex])) {
                    minIndex = j;
                }
            }
            exch(arr, i, minIndex);
        }

    }


}
