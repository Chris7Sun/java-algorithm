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
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int begin, int end){
        int i = begin,j = end;
        int temp = arr[begin];
        if (i >= j)
            return;
        while(i < j){
            while (arr[j] >= temp && i < j)
                j--;
            while (arr[i] <= temp && i < j)
                i++;
            if(i < j)
                change(arr, i ,j);
        }
        arr[begin] = arr[i];
        arr[i] = temp;
        quickSort(arr,begin,i-1);
        quickSort(arr,i+1,end);
    }

    public static void change(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
