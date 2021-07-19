

public class Solution {

    public static int maximumGap(final int[] A) {

        if (A.length == 0 || A.length == 1)
            return 0;


        int i = 0, j = 0;
        int max =0;

        while(i < A.length){
            j = i+1;

            while(j < A.length){

                if(A[i] <= A[j]){
                    if(j-i > max)
                        max = j-i;
                }
                j++;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 4, 2};
        System.out.println(maximumGap(A));




    }

}