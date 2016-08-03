package com.sun.algorithm;

/**
 * Created by Chris on 2016/8/3.
 * description：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。（剑指offer）
 */
public class JumpStairs {
    public int JumpFloor(int target) {
        //迭代法
        if(target == 1 || target ==2)
            return target;
        int jumps = 0;
        int numberMinusTwo = 1;
        int numberMinusOne = 2;
        for(int i=3; i <= target; ++i){
            jumps = numberMinusTwo + numberMinusOne;
            numberMinusTwo = numberMinusOne;
            numberMinusOne = jumps;
        }
        return jumps;

        /*
        递归法
        if(target <= 0)
            return -1;
        else if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        else return JumpFloor(target - 1) + JumpFloor(target - 2);*/
    }
}
