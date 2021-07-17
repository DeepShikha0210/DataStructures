package StringArrayAssignment;

public class Leaders {
        public static void leaders(int[] arr) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Print output and don't return it.
             * Taking input is handled automatically.
             */

            int[] maxRight = new int[arr.length];
            int max= Integer.MIN_VALUE;
            for(int i = arr.length-1; i >= 0 ; i--){

                if(arr[i] > max){

                    max= arr[i];
                    maxRight[i] = max;
                }
                else
                    maxRight[i] = max;

            }

            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= maxRight[i])
                    System.out.print(arr[i] + " ");

            }
        }
    }

