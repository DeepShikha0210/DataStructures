package Patterns;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int i=1;
    int count =1;
    while(count<=x){

        int term = (3*i)+2;
        if(term%4 != 0) {
            System.out.print(term + " ");
            count++;
        }
        i++;

    }
}
}
