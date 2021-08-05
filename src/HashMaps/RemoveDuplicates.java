package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr){

        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for(int i =0; i< arr.length; i++) {
            if (seen.containsKey(arr[i]))
                continue;
            else {
                seen.put(arr[i], true);
                output.add(arr[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int[] arr = { 1,3,2,4,1,2,2,2,10000, 3, 2 };
        System.out.println(removeDuplicates(arr));
    }
}
