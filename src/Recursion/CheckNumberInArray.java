package Recursion;

public class CheckNumberInArray {
    public static boolean checkNumber(int[] input, int x) {

        return helper(input , 0, x);

    }

    public static boolean helper(int[] input , int index , int x){

        if(index == input.length)
            return false;

        if(input[index] == x)
            return true;

        else
            return helper(input, index + 1 , x);

    }
    public static void main(String[] args) {

        int[] input = {4,2,1};
        System.out.println(checkNumber(input, 4));
    }
}
