package com.sun.array;

/**
 * Created by Chris on 2016/9/9.
 */
public class SubArrayMaxProductValue {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        // write your code here
        if (nums.length == 0 || nums == null)
            return 0;
        int max = nums[0];
        int min = nums[0];
        int mostMax = max;

        for (int i=1; i < nums.length; ++i) {
            int tempMax = max;
            max = Math.max(Math.max(nums[i], tempMax*nums[i]), min*nums[i]);
            min = Math.min(Math.min(nums[i], tempMax*nums[i]), min*nums[i]);
            mostMax = max > mostMax ? max : mostMax;
        }
        return mostMax;
    }
}
