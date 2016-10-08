package com.sun.algorithm.dp;

/**
 * Created by Chris on 2016/9/20.
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(arr, amount));
    }
    public static int coinChange(int[] coins, int amount) {
        return search(0, amount, coins);
    }
    public static int search(int idx, int amount, int[] coins) {
        if(idx >= coins.length)
            return 0;
        return Math.max(search(idx+1, amount-coins[idx], coins) + 1, search(idx+1, amount, coins));
    }
}
