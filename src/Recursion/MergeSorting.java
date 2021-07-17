package Recursion;

public class MergeSorting {

    static void merge(int[] S1, int[] S2, int[] A){

        int i =0;
        int j =0;
        int k =0;

        while(i < S1.length && j < S2.length){

            if(S1[i] <= S2[j]) {
                A[k] = S1[i];
                i++;
            }

            else if(S1[i] > S2[j]) {
                A[k] = S2[j];
                j++;
            }

            k++;
        }

        if(i< S1.length) {
            while (i < S1.length) {
                A[k] = S1[i];
                i++;
                k++;

            }
        }

        else {
            while (j < S2.length) {
                A[k] = S2[j];
                j++;
                k++;
            }
        }
    }

    static void mergeSort(int[] A){
        if(A.length <=1)
            return;

        int mid = A.length/2;

        int[] S1 = new int[mid];
        int[] S2 = new int[A.length-mid];

        for(int i =0; i< mid; i++)
            S1[i] = A[i];

        for(int i = mid; i < A.length ; i++)
            S2[i-mid] = A[i];
        
        mergeSort(S1);
        mergeSort(S2);
        merge(S1, S2, A);

    }

    public static void main(String[] args) {
        int[] A= {10 , 9 , 8 , 7, 6, 5, 11, 8, 4};
        mergeSort(A);

        for(int i =0; i< A.length; i++)
            System.out.print(A[i] + " ");

    }
}
