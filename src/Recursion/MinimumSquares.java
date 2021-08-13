package Recursion;

public class MinimumSquares {

    public static int minCount(int n){
        /* Your class should be named Solution*/
        // base cases
        if (n <= 3)
            return n;

        // getMinSquares rest of the
        // table using recursive
        // formula
        // Maximum squares required is
        int res = n;
        // n (1*1 + 1*1 + ..)

        // Go through all smaller numbers
        // to recursively find minimum
        for (int x = 1; x <= n; x++)
        {
            int temp = x * x;
            if (temp > n)
                break;
            else
                res = Math.min(res, 1 + minCount(n - temp));
        }
        return res;
    }
}
