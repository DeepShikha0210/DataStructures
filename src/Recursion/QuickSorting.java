package Recursion;

public class QuickSorting {

    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        quickSort(input, 0, input.length-1);
    }

    public static void quickSort(int[] a, int startIndex, int endIndex){

        if(startIndex >= endIndex)
            return;

        //Pick an element and partition the array around it.
        int pivotIndex = partition(a, startIndex,endIndex);
        quickSort(a, startIndex , pivotIndex-1);
        quickSort(a, pivotIndex+1 , endIndex);

    }

    public static int partition(int[] a, int startIndex, int endIndex){

        int pivotElement = a[startIndex];
        int smallerNumberCount=0;
        for(int i=startIndex+1; i <= endIndex; i++){
            if (a[i] <= pivotElement)
                smallerNumberCount++;
        }
        /*
        int temp = a[startIndex+ smallerNumberCount];
        a[startIndex+smallerNumberCount]=pivotElement;
        a[startIndex] = temp; */
        int pivotPosition = startIndex+smallerNumberCount;
        swap(pivotPosition, startIndex, a);

        int i = startIndex;
        int j = endIndex;
        while(i <= pivotPosition && j > pivotPosition){

            while(a[i] <= pivotElement)
                i++;

            while(a[j] > pivotElement)
                j--;

            if(i <= pivotPosition && j > pivotPosition){            // Both a[j] and a[i] are at wrong places wrt to pivot element,so we swap them
             /*   temp = a[i];
               a[i] = a[j];
               a[j] = temp; */
                swap(i,j,a);
                i++;
                j--;

            }
        }
        return pivotPosition;

    }


    public static void swap(int i, int  j, int[] a){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] A= {10 , 9 , 8 , 7, 6, 5, 11, 8, 4};
        quickSort(A, 0, A.length-1);

        for (int j : A)
            System.out.print(j + " ");

    }


}
