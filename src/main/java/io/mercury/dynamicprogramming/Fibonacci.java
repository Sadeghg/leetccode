package io.mercury.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {
        int res = dp(5);
        System.out.println("Halt");
    }

    public static int bruteForce(int n) {
        if (n <= 1) {
            return n;
        }
        return bruteForce(n - 1) + bruteForce(n - 2);
    }

    // Memoization
    public static int memoization(int  n, int[] cache) {
        if (n <= 1) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        cache[n] = memoization(n - 1, cache) + memoization(n - 2, cache);
        return cache[n];
    }

    // Dynamic Programming
    public static int dp(int n) { // 5
        if (n < 2) {
            return n;
        }// 0
        int[] dp = {0,1}; // {1, 1}, {1, 2}, {2, 3}, {3, 5}
        int i = 2;
        while (i <= n) {
            int tmp = dp[1]; // 1
            dp[1] = dp[0] + dp[1];
            dp[0] = tmp;
            i++;
        }
        return dp[1];
    }
}
