package Recursion;

public class SubsetSumK {
    public static int[][] subsetsSum(int[] input, int k){
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

    public static void main(String[] args) {
        int[] A = {3,2,3};
        int k =5;
        System.out.println(subsetsSum(A, 5));


    }
}
