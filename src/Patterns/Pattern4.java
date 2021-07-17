package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int p = N;

        while (i <= N) {
            int j = 1;
            char c = (char) ('A'+ p - 1);
            while (j <= i) {
                System.out.print(c);
                j++;
                c = (char) (c+1);
            }
            System.out.println();
            i++;
            p--;
        }
    }
}
