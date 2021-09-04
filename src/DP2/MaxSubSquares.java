package DP2;

public class MaxSubSquares {
    public static int findMaxSquareWithAllZeros(int[][] input){

        if(input.length == 0)
            return 0;

        int m = input.length;
        int n = input[0].length;

        int[][] storage = new int[m][n];
        int max = 1;

        for(int i =0 ; i < m ;i++ ){
            if(input[i][0] == 0)
                storage[i][0] = 1;
            else
                storage[i][0]= 0;
        }

        for(int i =0 ; i < n ;i++ ){
            if(input[0][i] == 0)
                storage[0][i] = 1;
            else
                storage[0][i]= 0;
        }

        for(int i =1 ; i < m ;i++ ){
            for(int j =1 ; j < n ;j++ ){
                if(input[i][j] == 0)
                    storage[i][j] = 1 + Math.min(storage[i-1][j-1] , Math.min(storage[i-1][j], storage[i][j-1]));

                else
                    storage[i][j] = 0;

                max = Math.max(max, storage[i][j]);
            }
        }

        return max;
    }
}
