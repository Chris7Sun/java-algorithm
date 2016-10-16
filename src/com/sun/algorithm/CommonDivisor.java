package com.sun.algorithm;

/**
 * Created by Chris on 2016/10/16.
 */
public class CommonDivisor {
    public static void main(String[] args) {
        int getCommonDivisor = getCommonDivisor(100, 36);
        System.out.println(getCommonDivisor);
        int getCommonMultiple = getCommonMultiple(2, 7);
        System.out.println(getCommonMultiple);
    }
    public static int getCommonDivisor(int a, int b) {
        if (a % b == 0)
            return b;
        return getCommonDivisor(b, a % b);
    }
    public static int getCommonMultiple(int a, int b) {
        int c = a * b;
        if (a < b) {
            int r = a;
            a = b;
            b = r;
        }
        while (true) {
            int k = a % b;
            if (k == 0) {
                return (c / b);
            } else {
                a = b;
                b = k;
            }
        }
    }
}
