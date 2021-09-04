package DP2;

import java.util.Arrays;

public class MCM {
    static int[][] dp = new int[101][101];

    public static int mcm(int[] p){

        int i = 1, j = p.length-1;

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return matrixChainMemoized(p, i, j);
    }

    public static int matrixChainMemoized(int[] p, int i, int j){

        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            dp[i][j] = Math.min(dp[i][j], matrixChainMemoized(p, i, k) + matrixChainMemoized(p, k + 1, j) + p[i - 1] * p[k] * p[j]);
        }
        return dp[i][j];
    }
}
