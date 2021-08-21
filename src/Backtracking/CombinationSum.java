package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int sum) {

        if (arr.length == 0 || sum == 0)
            return result;

        if (arr.length == 1 && arr[0] != sum)
            return result;

        Arrays.sort(arr);

        int[] temp = new int[arr.length];   // Handle duplicates in array

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }

        temp[j++] = arr[arr.length - 1];
        arr = new int[j];
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];               //  end

        /*                                           //Handle duplicates in case of arraylist
        *  Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        *  */


        combinationSum(arr, sum, 0, new ArrayList<>());
        return result;

    }

    public static void combinationSum(int[] arr, int sum, int index, ArrayList<Integer> current) {

        if (sum < 0)
            return;

        if (sum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            combinationSum(arr, sum - arr[i], i, current);
            current.remove(current.size() - 1);
        }

    }
}
