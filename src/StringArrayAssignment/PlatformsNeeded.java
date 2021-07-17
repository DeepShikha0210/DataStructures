package StringArrayAssignment;

import java.util.Arrays;

public class PlatformsNeeded {

    public static int platformsNeeded(int[] arrival, int[] departure) {

        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0;
        int j = 0;
        int count =0;
        int max = Integer.MIN_VALUE;

        while(i < arrival.length && j < departure.length){
            if(arrival[i] < departure[j]){
                count++;
                i++;
            }

            else{
                count--;
                j++;
            }

            if(count > max)
                max = count;
        }

        return max;
    }
    public static int platformsNeeded1(int[] arrival, int[] departure) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 1, j = 0;
        int platformNeeded = 1;
        int minimumRequired = 0;


        while (j < departure.length && i < arrival.length) {

            if (arrival[i] < departure[j]) {
                platformNeeded++;
                i++;
            } else if (arrival[i] > departure[j]) {
                platformNeeded--;
                j++;
            }

            if (platformNeeded > minimumRequired)
                minimumRequired = platformNeeded;

        }
        return minimumRequired;
    }

    public static void main(String[] args) {
        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(platformsNeeded(arr, dep));

    }

}

