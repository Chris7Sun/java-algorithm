package com.sun.array;

/**
 * Created by Chris on 2016/9/8.
 */
public class SubArrayMaxValue {
    public static void main(String[] args) {
        int[] arr = {-1,-5};
        System.out.println(getMaxValue(arr));
    }
    public static int getMaxValue(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i=0; i<nums.length; ++i) {
            cur = cur + nums[i];
            max = max > cur ? max : cur;
            if (cur < 0)
                cur = 0;
        }
        return max;
    }
}
