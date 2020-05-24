package com.yaoding.fundamental.sort;

/**
 * 希尔排序， 为了优化插入排序的比较次数，按照一定的区间进行排序
 *
 */
public class ShellSort extends Sort {
    @Override
    public void sort(Comparable[] arr) {
        //构建序列 一般公式
        int N = arr.length;
        int h = 1;
        while(h<N/3) h = 3*h+1;

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exch(arr, j, j - h);
                }
            }
            h = h/3;
        }

    }
}
