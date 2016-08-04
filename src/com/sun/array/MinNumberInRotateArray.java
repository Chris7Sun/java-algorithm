package com.sun.array;

/**
 * Created by Chris on 2016/8/4.
 * description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
                输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
                例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
                NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。(剑指offer)
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        int begin = 0, end = array.length - 1;
        if(array == null || array.length == 0)
            return 0;
        else if (array[begin] < array[end])
            return array[begin];
        while(begin < end){
            int mid = begin + (end - begin)/2;
            if(array[mid] > array[end])
                begin = mid + 1;
            else
                end = mid;
        }
        return array[begin];
    }
}
