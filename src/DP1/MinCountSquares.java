package DP1;

public class MinCountSquares {

    static int getMinSquares(int n)
    {
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
                res = Math.min(res, 1 + getMinSquares(n - temp));
        }
        return res;
    }

    public static int minCount(int n) {
        //Your code goes here
        int[] storage  = new int[n+1];
        storage[0]=0;
        storage[1] =1;
        for(int i=2;i<=n;i++) {
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i);j++) {
                int count = storage[i-(j*j)];
                if(min > count) {
                    min = count;
                }

            }
            storage[i] = min + 1;

        }
        return storage[n];

    }

    // Driver code
    public static void main(String args[])
    {
        System.out.println(getMinSquares(50));
        System.out.println(minCount(50));
    }
}
