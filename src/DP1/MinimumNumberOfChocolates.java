package DP1;

import java.util.Arrays;

public class MinimumNumberOfChocolates {

    public static int getMin(int[] score, int N){

        int[] dp = new int[N];
        int total = 0;

        Arrays.fill(dp, 1);

        // Traverse from left to right
        for (int i = 1; i < N; i++) {
            if (score[i] > score[i - 1])
                dp[i] = dp[i - 1] + 1;
            else
                dp[i] = 1;
        }

        // Traverse from right to left
        for (int i = N - 2; i >= 0; i--) {
            if (score[i] > score[i + 1])
                dp[i] = Math.max(dp[i + 1] + 1, dp[i]);
            else
                dp[i] = Math.max(dp[i], 1);
        }

        for(int i: dp)
            total+=i;

        return total;
    }
}
