package com.sun.search;

/**
 * Created by Chris on 2016/8/5.
 * description: 二分查找
 */
public class BinarySearch {
    public int binarySearch(int[] arr,int low, int high, int target){
        int mid;
        while(low <= high){
            mid = low + (high - low)/2;  //这种方式比(low + high)/2避免溢出
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
