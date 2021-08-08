package Recursion;

import java.util.ArrayList;

public class AllIndices {

    static int[] indexArr;
    static int i=0;
    static ArrayList<Integer> output = new ArrayList<>();

    public static int[] allIndexes(int input[], int x) {

        helper(input , 0, x);

        indexArr = new int[output.size()];
        for(int i = 0; i< output.size(); i++)
            indexArr[i] = output.get(i);
        return indexArr;
    }

    public static void helper(int[] input , int index , int x){

        if(index == input.length)
            return;

        if(input[index] == x)
            output.add(index);

        helper(input, index + 1 , x);

    }
    public static void main(String[] args) {

        int[] input = {9,8,10,8};
        allIndexes(input, 8);

        for(int i : indexArr)
            System.out.print(i + " ");


    }
}
