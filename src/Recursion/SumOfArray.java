package Recursion;

public class SumOfArray {
    static int sum =0;
    public static int sum(int[] input) {

        helper(input, 0);
        return sum;
    }

    public static void helper(int[] input , int index){

        if(index == input.length)
            return;

        sum = sum + input[index];
        helper(input, index + 1);

    }
    public static void main(String[] args) {

        int[] input = {4,2,1};
        System.out.println(sum(input));
    }
}
