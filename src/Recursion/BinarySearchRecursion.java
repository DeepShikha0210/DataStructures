package Recursion;

public class BinarySearchRecursion {

    static int binarySearch(int[] a , int start, int end, int x){

        if(start> end)
            return -1;

        int mid = start + (end-start)/2;

        if(a[mid] == x)
            return mid;

        else if(a[mid] < x)
            return binarySearch(a, mid+1, end, x);

        else
            return binarySearch(a, start, mid-1, x);
    }

    public static void main(String[] args) {

        int[] a = {1,3,5,7,11,14};

        System.out.println(binarySearch(a, 0, a.length-1, 14));
    }
}
