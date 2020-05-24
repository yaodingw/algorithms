package com.yaoding.fundamental.sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 *  定义抽象类的排序方法，用于每个排序的算法，都按照此模板
 */
public abstract class Sort {
    //具体的抽象方法
    public abstract void sort(Comparable[] arr);

    //是否小于
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    //交换
    public void exch(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //在单行中打印数组
    public void show(Comparable[] arr){
        for (Comparable a : arr) {
            StdOut.print(a + " ");
        }
        StdOut.println();
    }

    //判断数组是否有序
    public boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public Comparable[] getRandomArr(int length) {
        return getRandomArr(length, length*10);
    }

    public Comparable[] getRandomArr(int length, int scope) {
        Comparable[] arr = new Comparable[length];
        for (int i = 0; i < length; i++) {
            arr[i] = StdRandom.uniform(scope);
        }
        return arr;
    }



}
