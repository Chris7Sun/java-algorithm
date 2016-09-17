package com.sun.algorithm;

/**
 * Created by Chris on 2016/9/9.
 */
public class MinPathSum {
    public static void main(String[] args) {
        int[][] arr = {{0,3,4},{2,1,8},{4,5,7}};
        System.out.println(minPathSum(arr));
    }
    public static int minPathSum(int[][] grid) {
        // write your code here
        return search(grid.length - 1, grid[0].length - 1, grid);
    }
    public static int search(int x, int y, int[][] grid) {
        if (x == 0 && y == 0)
            return grid[x][y];
        if (x == 0 && y == 1)
            return grid[x][y];
        if (x == 1 && y == 0)
            return grid[x][y];
        return Math.min(search(x-1,y,grid),search(x,y-1,grid)) + grid[x][y];
    }
}
