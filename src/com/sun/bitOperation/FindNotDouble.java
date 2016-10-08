package com.sun.bitOperation;

/**
 * Created by Chris on 2016/9/23.
 */
public class FindNotDouble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,4,3,1};
        System.out.println(findNotDouble(arr));
    }
    public static int findNotDouble(int[] arr) {
        int result = arr[0];
        for (int i=1; i<arr.length; ++i){
            result ^= arr[i];
        }
        return result;
    }
}
