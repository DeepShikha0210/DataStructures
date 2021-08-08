package Recursion;

public class FirstIndex {

    public static int firstIndex(int input[], int x) {

        return helper(input , 0, x);

    }

    public static int helper(int[] input , int index , int x){

        if(index == input.length)
            return -1;

        if(input[index] == x)
            return index;

        else
            return helper(input, index + 1 , x);

    }

    public static void main(String[] args) {

        int[] input = {9,8,10,8};
        System.out.println(firstIndex(input, 8));
    }
}
