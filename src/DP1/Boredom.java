package DP1;

public class Boredom {

    public int solve(int n, int[] arr) {

        int[] count = new int[1001];
        for(int i=0; i< n; i++)
            count[arr[i]]++;

        int[] dp =  new int[1001];
        dp[0] = 0;
        dp[1] = count[1];

        for(int i =2; i < 1001; i++ )
            dp[i] = Math.max(dp[i-1], dp[i-2] + count[i]*i);

        return dp[1000];
    }

}
