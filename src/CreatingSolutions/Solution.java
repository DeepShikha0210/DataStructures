package CreatingSolutions;

import java.util.Arrays;
import java.util.Comparator;

class Solution {

    public static int maximumGap(final int[] A) {

        int n = A.length;


        Pair[] arr = new Pair[n];

        for (int i = 0; i < A.length; i++)
            arr[i] = new Pair(i, A[i]);

        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.value - o2.value;
            }
        });

        for(int i=0; i< arr.length; i++)
            System.out.println(arr[i].index + " " + arr[i].value);

        int max = Integer.MIN_VALUE;
        int j = 0;
        while (j < arr.length - 1) {
            for (int i = j+1; i < arr.length; i++) {

                if (arr[i].index - arr[j].index > max)
                    max = arr[i].index - arr[j].index;

            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
           int[] A = {3,2,1};
        System.out.println(maximumGap(A));
    }
}