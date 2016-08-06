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
    }
}
