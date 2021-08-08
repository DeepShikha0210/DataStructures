package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        ArrayList<Integer> output = new ArrayList<>();
        int count = 0;
        int maxLength = 0, currentLength = 0;
        int start = 0, currentEnd = 0;
        int end = 0, currentStart = 0;

        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], true);
            map2.put(arr[i] , i);

        }


        for (int i = 0; i < arr.length; i++) {

            currentLength=0;
            int current = arr[i];
            currentStart = current;
            while (map.containsKey(current) && map.get(current).equals(true)) {

                currentLength++;
                map.put(current, false);
                currentEnd = current;
                current++;
            }
            current = arr[i];

            while (map.containsKey(current - 1) && map.get(current-1).equals(true)) {
                currentStart=current-1;
                map.put(currentStart, false);
                currentLength++;
                current--;

            }
            if(currentLength > maxLength || (currentLength == maxLength && map2.get(currentStart) < map2.get(start) ))
            {
                maxLength = currentLength;
                start = currentStart;
                end = currentEnd;
            }
        }

        output.add(start);
        output.add(end);
        return output;
    }



    public static void main(String[] args) {
        // int[] input = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1 ,8, 6 };
        int[] input = {15, 24, 23, 12, 19, 11, 16 };
        int size= input.length;

        System.out.println(longestConsecutiveIncreasingSequence(input));

    }
}
