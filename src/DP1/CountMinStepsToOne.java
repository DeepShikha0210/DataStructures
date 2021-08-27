package DP1;

public class CountMinStepsToOne {

    public static int countMinStepsToOne(int n) {

        if(n == 1)
            return 0;

        int option1 = countMinStepsToOne(n -1);

        int count = option1;

        if(n%2 == 0) {
            int option2 = countMinStepsToOne(n / 2);
            count = Math.min(count, option2);
        }

        if(n%3 == 0) {
            int option3 = countMinStepsToOne(n / 3);
            count = Math.min(count, option3);
        }

        return 1+count;
    }

    public static int countMinStepsToOneM(int n){

        int[] storage = new int[n+1];
        return countMinStepsToOneM(n , storage);
    }

    private static int countMinStepsToOneM(int n , int[] storage){
        if(n ==1) {
            storage[n] = 0;
            return storage[n];
        }

        if(storage[n] != 0)                // Check if already calculated and return if yes
            return storage[n];

        // If not already calculated, perform processing steps and find result by recursive calls

        int option1 = countMinStepsToOneM(n -1 , storage);

        int count = option1;

        if(n%3 == 0) {
            int option2 = countMinStepsToOneM(n / 3, storage);
            count = Math.min(count, option2);
        }
        if(n%2 == 0) {
            int option3 = countMinStepsToOneM(n / 2, storage);
            count = Math.min(count, option3);
        }

        storage[n] = 1 + count;           // store the calculated result and return result
        return storage[n];
    }

    public static int countMinStepsToOneDP(int n) {  // bottom up approach

        int[] storage = new int[n+1];

        storage[1] = 0;                          //Add the base condition values

        for(int i =2; i < n+1 ; i++){            // fill the storage array starting from base to last element using for loop
            int min =  storage[i-1];
            if(i%3 == 0) {
                min = Math.min(min, storage[i / 3]);
            }

            if(i%2 == 0){
                min = Math.min(min , storage[i / 2]);
            }

            storage[i] = 1 + min;
        }

        return storage[n];                   //return last element

    }

    public static void main(String[] args) {
        System.out.println(countMinStepsToOne(1000));
        System.out.println(countMinStepsToOneM(1000));
        System.out.println(countMinStepsToOneDP(1000));
    }
}
