package Recursion;

import java.util.ArrayList;

public class SubsetSumProblem {
    public static int[][] subsetsOfArray(int[] arr,int start,int end){

        if(start>end) {
            return new int[1][0];
        }
        int[][] smallAns=subsetsOfArray(arr, start+1, end);
        int[][] ans=new int[smallAns.length * 2][];

        for(int i=0;i<smallAns.length;i++) {
            ans[i]=new int[smallAns[i].length];
            for(int j=0;j<smallAns[i].length;j++) {
                ans[i][j]=smallAns[i][j];
            }
        }
        for(int i=smallAns.length ; i<ans.length;i++) {
            ans[i]=new int[smallAns[i-smallAns.length].length + 1];
            ans[i][0]=arr[start];
            for(int j=1;j<ans[i].length;j++) {
                ans[i][j]=smallAns[i-smallAns.length][j-1];
            }
        }
        return ans;
    }
    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int input[]) {
        // Write your code here

        return subsetsOfArray(input,0,input.length-1);
    }

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void printSubsets(int input[]) {
        // Write your code here

        helper(input, new ArrayList<Integer>(), 0);

        for (int i = 0; i <result.size(); i++) {
            for (int j = 0; j <result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
    public static void helper(int[] arr, ArrayList<Integer> current , int n){
        if(n == arr.length){
            result.add(new ArrayList<>(current) );
            return;
        }

        current.add(arr[n]);
        helper(arr, current, n+1);
        current.remove(current.size()-1);
        helper(arr, current, n+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printSubsets(arr);
    }
    
}
