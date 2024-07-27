package io.mercury.dynamicprogramming;

public class CountPath {

    public static void main(String[] args) {
//        int [][] cache = new int[3][3];
//        int result = memoization(0, 0, 3, 3, cache);
//        System.out.println("Halt");
        int count = dp(3, 3);
        System.out.println("Halt");
    }
    // Brute Force - Time: O(2 ^ (n + m)), Space: O(n + m)
    public static int bruteForce(
            int r,
            int c,
            int rows,
            int cols
    ) {
        if (r == rows || c == cols) {
            return 0;
        }
        if (r == rows - 1 && c == cols - 1) {
            return 1;
        }
        return (
                bruteForce(
                        r + 1,
                        c,
                        rows,
                        cols
                ) +
                bruteForce(
                        r,
                        c + 1,
                        rows,
                        cols)
        );
    }

    // Memoization - Time and Space: O(n * m)
    public static int memoization(
            int r,
            int c,
            int rows,
            int cols,
            int[][] cache
    ) {
        if (r == rows || c == cols) {
            return 0;
        }
        if (cache[r][c] > 0) {
            return cache[r][c];
        }
        if (r == rows - 1 && c == cols - 1) {
            return 1;
        }
        int row = memoization(
                r + 1,
                c,
                rows,
                cols,
                cache
        );
        int col = memoization(
                r,
                c + 1,
                rows,
                cols,
                cache
        );

        cache[r][c] = row + col;
        return cache[r][c];
    }

    // Dynamic Programming - Time: O(n * m), Space: O(m), where m is num of cols
    public static int dp(
            int rows,
            int cols
    ) {
        int[] prevRow = new int[cols];

        for (int i = rows - 1; i >= 0; i--) {
            int[] curRow = new int[cols];
            curRow[cols - 1] = 1;
            for (int j = cols - 2; j >= 0; j--) {
                curRow[j] = curRow[j + 1] + prevRow[j];
            }
            prevRow = curRow;
        }
        return prevRow[0];
    }

}
