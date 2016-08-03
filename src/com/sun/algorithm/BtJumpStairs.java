package com.sun.algorithm;

/**
 * Created by Chris on 2016/8/3.
 */
public class BtJumpStairs {
    public int JumpFloorII(int target) {
        //迭代法
        if(target <= 0)
            return -1;
        else if(target == 1)
            return 1;
        int jump = 1;
        int total = 0;
        for(int i=2; i<=target;++i){
            total = jump * 2;
            jump = total;
        }
        return total;


        /*
        //递归法
        if (target <= 0)
            return -1;
        else if (target == 1)
            return 1;
        else
            return 2 * JumpFloorII(target - 1);*/
    }
}
