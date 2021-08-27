package DP1;

public class NumberOfCodes {
    public static int num_codes(String s) {

        int[] a = new int[s.length()];
        for(int i = 0; i < a.length; i++)
            a[i] = s.charAt(i) - '0';

        return num_codes(a, a.length);
    }


    public static int num_codes(int[] a, int n) {
        if (n == 1)
            return 1;

        if (n == 0)
            return 1;

        int output = num_codes(a, n - 1);
        if (a[n - 2] * 10 + a[n - 1] <= 26)
            output += num_codes(a, n - 2);

        return output;
    }

    public static int num_codesM(int[] a, int n) {
        int[] storage = new int[n];
        return num_codesM(a, n, storage);
    }

    public static int num_codesM(int[] a, int n, int[] storage) {

        if(n ==1)
            return 1;
        if(n == 0)
            return 1;

        if(storage[n] != 0)
            return storage[n];

        int output = num_codes(a, n - 1);
        if (a[n - 2] * 10 + a[n - 1] <= 0)
            output += num_codes(a, n - 2);

        storage[n] = output;
        return storage[n];

    }

    public static int num_codesDP(int[] a, int n) {
        int[] storage = new int[n + 1];
        storage[0] = 1;
        storage[1] = 1;

        if (storage[n] != 0)
            return storage[n];

        for (int i = 2; i < n + 1; i++) {
            storage[i] = storage[i - 1];
            if (a[i - 2] * 10 + a[i - 1] <= 26)
                storage[i] += storage[i - 2];
        }

        return storage[n];
    }

    public static void main(String[] args) {

        System.out.println(num_codes("1234"));

    }
}
