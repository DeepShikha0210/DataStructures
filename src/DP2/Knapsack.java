package DP2;

import java.util.Arrays;

public class Knapsack {
    static int knapsack(int wt[], int val[], int n, int W)
    {
        // array to store final result
        //dp[i] stores the profit with KnapSack capacity "i"
        int[] dp = new int[W+1];

        //initially profit with 0 to W KnapSack capacity is 0
        Arrays.fill(dp, 0);

        // iterate through all items
        for(int i=0; i < n; i++)

            //traverse dp array from right to left
            for(int j = W; j >= wt[i]; j--)
                dp[j] = Math.max(dp[j] , val[i] + dp[j - wt[i]]);

    /*above line finds out maximum of dp[j](excluding ith element value)
    and val[i] + dp[j-wt[i]] (including ith element value and the
    profit with "KnapSack capacity - ith element weight") */
        return dp[W];
    }
}
