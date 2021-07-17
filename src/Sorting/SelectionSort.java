package Sorting;

public class SelectionSort {

        static void selectionSort ( int[] input)
        {

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < input.length; i++) {
                // Find the minimum element in unsorted array
                int min = input[i];
                int min_idx = i;
                for (int j = i ; j < input.length; j++)
                    if (input[j] < min) {
                        min_idx = j;
                        min=input[j];
                    }
                // Swap the found minimum element with the first
                // element
                int temp = input[min_idx];
                input[min_idx] = input[i];
                input[i] = temp;
            }
        }

        // Prints the array
        static void printArray ( int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code to test above
        public static void main(String args[])
        {

           // int arr[] = {64,25,12,22,11};
            //selectionSort(arr);
            //System.out.println("Sorted array");
            //printArray(arr);
            for(int n = 10 ; n <= 1000000; n=n*10 ){
                int[] input = new int[n];
                for(int i =0 ; i < input.length; i++){
                    input[i] = input.length - i;
                }

                long startTime = System.currentTimeMillis();
                selectionSort(input);
                long endTime = System.currentTimeMillis();
                System.out.println("Time by selection for " + n + " is " + (endTime-startTime));
            }

        }
 }

