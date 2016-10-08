package com.sun.sort;

import java.util.Arrays;

/**
 * 快速排序
 * Created by Chris on 2016/7/12.
 */
public class QucikSort {
    public static void main(String[] args){
        int[] arr = {6,1,2,7,9,3,4,5,10,8,6,1,2,7,9,3,4,5,10,8,6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr){
        partition(0, arr.length-1, arr);
    }
    private static void partition(int begin, int end, int[] arr) {
        if (begin > end)
            return;
        int i = begin, j = end;
        int temp = arr[begin];
        while(i < j) {
            while (i < j && arr[j] >= temp)
                --j;
            while (i < j && arr[i] <= temp)
                ++i;
            if (i < j)
                change(i, j, arr);
        }
        arr[begin] = arr[i];
        arr[i] = temp;
        partition(begin, i-1, arr);
        partition(i+1, end, arr);
    }

    private static void change(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
