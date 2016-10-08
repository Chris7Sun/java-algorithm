package com.sun.bitOperation;

/**
 * Created by Chris on 2016/9/23.
 */
public class CountOne {
    public static void main(String[] args) {
        System.out.println(countOne2(1));
    }
    public static int countOne(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n >>= 1;
        }
        return count;
    }
    public static int countOne2(int n) {
        int count = 0;
        while (n > 0) {
            if (n != 0)
                n = (n&(n-1));
            count++;
        }
        return count;
    }
}
