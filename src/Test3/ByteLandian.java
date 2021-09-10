package Test3;

import java.util.HashMap;

public class ByteLandian {
    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
        if (n < 12) {
            return n;
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long t = bytelandian(n / 2, memo) + bytelandian(n / 3, memo) + bytelandian(n / 4, memo);
            memo.put(n, t);
            return t;
        }
    }
}
