package HashMaps;

import java.util.HashMap;

public class PairSum {

    public static int pairSum(int[] input, int size) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< input.length; i++){

            for(int j =i; j< map.size(); j++){

                if(input[i] + map.get(j) == 0 && i!=j ) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = {2, 1, -2, 2, 3};
        int size= input.length;

        System.out.println(pairSum(input, size));

    }

}