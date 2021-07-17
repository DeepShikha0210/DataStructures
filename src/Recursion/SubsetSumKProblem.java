package Recursion;

import java.util.ArrayList;

public class SubsetSumKProblem {

    // Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int[] input, int k){
        return subsetSumKHelper(input, 0, k);
    }

    public static int[][] subsetSumKHelper(int[] input, int n, int k){
        if(n == input.length) {
            if (k == 0)
                return new int[1][0];
            else
                return new int[0][0];
        }

        int[][] smallOutput1 = subsetSumKHelper(input, n + 1, k);
        int[][] smallOutput2 = subsetSumKHelper(input, n + 1, k - input[n]);

        int[][] output = new int[smallOutput1.length + smallOutput2.length][];
        int index = 0;
        for (int i = 0; i < smallOutput1.length; i++)
            output[index++] = smallOutput1[i];

        for (int i = 0; i < smallOutput2.length; i++) {
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = input[n];
            for (int j = 0; j < smallOutput2[i].length; j++)
                output[index][j + 1] = smallOutput2[i][j];

            index++;
        }
        return output;
    }

    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        helper(input, k, 0, new ArrayList<>());
    }
    public static void helper(int[] arr , int k, int n, ArrayList<Integer> output){
        if(k == 0){
            for (int i=0;i<output.size();i++)
                System.out.print(output.get(i) + " ");
            System.out.println();
            return;
        }

        if(n == arr.length)
            return;

        helper(arr, k , n+1, output);
        ArrayList<Integer> out = new ArrayList<>(output);
        out.add(arr[n]);
        helper(arr, k - arr[n], n+1, out );
    }

    public static void main(String[] args) {
        int arr[] = { 17, 18, 6, 11, 2, 4   };
        int sum = 6;
        int n = arr.length;
        printSubsetsSumTok(arr, sum);
    }
}
