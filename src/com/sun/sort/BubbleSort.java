package com.sun.sort;

import java.util.Arrays;

/**
 * Created by Chris on 2016/9/20.
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {49,38,65,97,76,13,27,49};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {6,1,2,7,9,3,4,5,10,8,6,1,2,7,9,3,4,5,10,8,6,1,2,7,9,3,4,5,10,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        if (arr.length <= 1)
            return;

        for (int i=arr.length-1; i >= 0; --i) {
            int flag = 0;
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    exchange(j, j + 1, arr);
                    flag = 1;
                }
            }
            if (flag == 0)
                return;
        }
    }

    private static void exchange(int j, int i, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
