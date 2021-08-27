package DP1;

import java.util.Scanner;

public class AlphaCode {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.equals("0") == false) {
            int ans = solve(s);
            System.out.println(ans);
            s = sc.next();
        }
    }

    public static int solve(String s) {
        long mod = 1000000007;
        int n = s.length();
        int[] storage = new int[n + 1];
        storage[0] = 1;

        for (int i = 1; i < n; i++) {
            storage[i] = 0;
            int x = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (s.charAt(i) != '0')
                storage[i] = storage[i - 1];

            if (x >= 10 && x <= 26 && i > 1)
                storage[i] = (int) ((storage[i] + storage[i - 2]) % mod);

            else if (x >= 10 && x <= 26)
                storage[i]++;

            storage[i] = (int) (storage[i] % mod);

        }
        return storage[n - 1];
    }
}
