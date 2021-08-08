package Recursion;

public class LastIndex {
    public static int lastIndex(int input[], int x) {

        return helper(input , input.length-1, x);

    }

    public static int helper(int[] input , int index , int x){

        if(index < 0)
            return -1;

        if(input[index] == x)
            return index;

        else
            return helper(input, index - 1 , x);

    }

    public static void main(String[] args) {

        int[] input = {9,8,10,8};
        System.out.println(lastIndex(input, 8));
    }
}
