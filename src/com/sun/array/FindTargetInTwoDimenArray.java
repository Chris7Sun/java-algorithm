package com.sun.array;

/**
 * Created by Chris on 2016/8/6.
 * description:在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。(剑指offer)
 */
public class FindTargetInTwoDimenArray {
    public boolean findTarget(int[][] array, int target){
        if(array == null)
            return false;

        int row = array.length - 1;
        int column = 0;

        for(int i = 0; i <= row; i++){
            return binarySearch(array[i],0,array[i].length-1,target);
        }
        return false;

        /*
        //从左下角开始找，比它小的行减1，比它大的列加1
        while(row >= 0 && column < array[row].length){
            if(target == array[row][column])
                return true;
            else if(target > array[row][column]){
                column++;
            }else if(target < array[row][column]){
                row--;
            }
        }
        return false;
        */
    }
    public static boolean binarySearch(int[] arr, int low, int high, int target){
        int mid = low + (high - low)/2;
        if(low < 0 || high < 0)
            return false;
        if(arr[mid] == target)
            return true;
        else if(target > arr[mid]){
            return binarySearch(arr,mid+1,high,target);
        }else if(target < arr[mid]){
            return binarySearch(arr,low,mid-1,target);
        }else
            return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,11,213,435,2345,5789};
        System.out.println(binarySearch(arr,0,arr.length-1,0));
    }
}
