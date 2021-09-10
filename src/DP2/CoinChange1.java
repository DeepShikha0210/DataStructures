package DP2;

public class CoinChange1 {
    public static int countWaysToMakeChange(int S[], int n) {
        // Write your code here
        int m = S.length;
        int table[] = new int[n + 1];

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[] values
        // after the index greater than or equal to the value of the
        // picked coin
        for (int i = 0; i < m; i++)
            for (int j = S[i]; j <= n; j++)
                table[j] += table[j - S[i]];

        return table[n];
    }
}