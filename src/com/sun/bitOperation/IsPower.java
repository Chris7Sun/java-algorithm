package com.sun.bitOperation;

/**
 * Created by Chris on 2016/9/23.
 */
public class IsPower {
    public static void main(String[] args) {
        System.out.println(isPower2(4));
    }
    public static boolean isPower(int n) {
        if (n < 1)
            return false;
        return (n&(n-1)) == 0;
    }
    public static boolean isPower2(int n) {
        if (n < 1)
            return false;
        int i = 1;
        while (i <= n) {
            if(i == n)
                return true;
            i = i << 1;
        }
        return false;
    }
}
