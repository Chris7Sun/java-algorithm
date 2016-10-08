package com.sun.algorithm.dp;

/**
 * Created by Chris on 2016/9/18.
 */
public class NumOfMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[4][6];
        int result = uniquePaths(3,9);
        System.out.println(result);
    }
    public static int uniquePaths(int m, int n) {
        if (m * n == 0)
            return 0;
        if (m == 1 || n == 1)
            return 1;

        return uniquePaths(m, n-1) + uniquePaths(m-1, n);
    }
}
