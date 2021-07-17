package StringArrayAssignment;

public class Sort012 {
    public static void sort012(int[] arr){
        //Your code goes here

        int nextZero=0;
        int nextTwo = arr.length-1;
        int i=0;

        while(i <= nextTwo)
        {
            if(arr[i] == 0){
                swap(i, nextZero, arr);
                nextZero++;
                i++;
            }

            else if(arr[i] == 2){
                swap(i, nextTwo, arr);
                nextTwo--;
            }

            else
                i++;
        }
    }
    static void swap(int i , int j, int[] arr){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] A= {2, 1, 0, 1, 2, 0 };
        sort012(A);
        for (int i =0; i< A.length; i++)
            System.out.print(A[i] + " ");
    }
}
