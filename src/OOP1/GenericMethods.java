package OOP1;

public class GenericMethods {

    public static void printInt(int[] arr){           // prints only int type of array
        for (int i=0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static<T> void printAny(T[] arr){          // prints any type of array - Generic Method

        for (int i=0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static<T extends DynamicArray> void printAny(T[] arr){          // prints any type of array that bound/extends dynamic array class - bound  Generic Method


        for (int i=0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    }

