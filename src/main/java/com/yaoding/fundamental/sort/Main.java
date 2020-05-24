package com.yaoding.fundamental.sort;

import edu.princeton.cs.algs4.Stopwatch;

public class Main {
    public static void main(String[] args) {
//        Sort method = new SelectionSort();
//        Sort method = new InsertSort();
        Sort method = new ShellSort();
        Comparable[] arr = method.getRandomArr(2000000);
//        method.show(arr);
        Stopwatch time = new Stopwatch();
        method.sort(arr);
        System.out.println(time.elapsedTime());
//        method.show(arr);
        System.out.println(method.isSorted(arr));
    }
}
