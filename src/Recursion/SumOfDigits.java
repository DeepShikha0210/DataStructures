package Recursion;

public class SumOfDigits {

    static int sum =0;
    public static int sumOfDigits(int input){
        // Write your code here
        if(input/10 == 0)
            return input%10 + sum;

        sum += input%10;
        return sumOfDigits(input/10);
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(12345));



    }
}
