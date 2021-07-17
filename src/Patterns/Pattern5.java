package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1, p = 1;
        int col = p, num =p;

        while (i <= N) {
            col = p;
            int j = 1;
            while (j <= col) {
                System.out.print(num);
                j++;
                num++;
                p++;
                if(num>9)
                    num = 1;
            }

            System.out.println();
            i++;
        }
    }
}
