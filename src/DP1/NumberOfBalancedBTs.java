package DP1;

public class NumberOfBalancedBTs {
    static final int MOD = 1000000007;

    public static long balancedBTs(long height) {
        long[] dp = new long[(int) height + 1];

        // base cases
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= height; ++i)
            dp[i] = (dp[i - 1] * ((2 * dp[i - 2]) % MOD + dp[i - 1]) % MOD) % MOD;

        return dp[(int) height];
    }

    public static long balancedBTsRecursive(long height){

        if(height == 0 || height == 1) {
            return 1;
        }
        int mod = (int)Math.pow(10, 9) + 7;
        long x = (long)balancedBTsRecursive(height-1);
        long y = (long)balancedBTsRecursive(height-2);

        long x_2 = (x*x)%mod;
        long x_y = (x*y)%mod;
        long x_y_2 = (2*x_y)% mod ;
        return (int)(x_2+x_y_2)%mod;
    }
    // Driver program
    public static void main (String[] args) {
        long h = 3;
        System.out.println("No. of balanced binary trees of height "+h+" is: "+ balancedBTs(h));
    }
}
