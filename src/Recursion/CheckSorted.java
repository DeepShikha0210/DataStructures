package Recursion;

public class CheckSorted {

    public static boolean sorted(int[] input){
        return helper(input, 0);
    }

    public static boolean helper(int[] input, int index){
        if(input.length-1 == index)
            return true;

        if(input[index] > input[index+1])
            return false;

        return helper(input, index+1);

    }

    public static void main(String[] args) {
        int[] input = {1,2,3,5,4};
        System.out.println(sorted(input));
    }
}
