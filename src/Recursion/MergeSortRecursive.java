package Recursion;

public class MergeSortRecursive {
    static void mergeSort(int[] A, int start, int end){
        if(start >= end)
            return;

        int mid = start + (end-start)/2;
        mergeSort(A, start, mid);
        mergeSort(A, mid+1, end);
        merge( A, start, end);

    }

    static void merge(int[] input, int start, int end){

        int mid = (start+end)/2;
        int[] ans = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k =0;


        while(i <= mid && j <= end){

            if(input[i] <= input[j]) {
                ans[k] = input[i];
                i++;

            }

            else if(input[i] > input[j]) {
                ans[k] = input[j];
                j++;
            }

            k++;
        }

        if(i<= mid) {
            while (i <= mid) {
                ans[k] = input[i];
                i++;
                k++;

            }
        }

        else {
            while (j <= end) {
                ans[k] = input[j];
                j++;
                k++;
            }
        }

        for(int index= 0; index< ans.length; index++)
            input[start+index] = ans[index];

    }

    public static void main(String[] args) {

        int[] A= {10 , 9 , 8 , 7, 6, 5, 11, 8, 4};
        mergeSort(A, 0 , A.length-1);

        for(int i =0; i< A.length; i++)
            System.out.print(A[i] + " ");


    }
}
