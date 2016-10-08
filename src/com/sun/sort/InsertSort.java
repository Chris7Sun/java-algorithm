package com.sun.sort;

import java.util.Arrays;

/**
 * Created by Chris on 2016/9/20.
 */
public class InsertSort {
    public static void main(String[] args) {
//        int[] arr = {49,38,65,97,76,13,27,49};
        int[] arr = {6,1,2,7,9,3,4,5,10,8,6,1,2,7,9,3,4,5,10,8,6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr.length <= 1)
            return;
        for (int i = 1; i < arr.length; ++i) {
            int temp = arr[i];
            int j = i;
            while (i > 0 && temp < arr[i-1]) {
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = temp;
            i = j;
        }
    }
}
