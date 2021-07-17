package StringArrayAssignment;

public class PushZerosAtEnd {

    public static void pushZerosAtEnd(int[] arr){
        int nonZero = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= { 5, 0, 7, 4, 8, 1, 3, 0, 7, 2, 0 };
        pushZerosAtEnd(arr);
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }


}
