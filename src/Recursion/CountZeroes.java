package Recursion;

public class CountZeroes {
    static int count =0;

    public static int countZerosRec(int input){

        String str = String.valueOf(input);

        if(input/10 == 0){
            return helper(str, 0);
        }

        // Count leading zeros
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;

        // Convert str into StringBuffer as Strings
        // are immutable.
        StringBuffer sb = new StringBuffer(str);

        // The  StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace(0, i, "");

        str =sb.toString();
        return helper(str, 0);
    }

    public static int helper(String input , int index ){

        if(index == input.length())
            return count;

        if(input.charAt(index) == '0')
            count++;

        return helper(input, index + 1);

    }

    public static int countZeros(int input){
        if(input<10){
            if(input == 0)
                return 1;
            else
                return 0;
        }

        if(input%10 == 0)
            return countZeros(input/10) + 1;

        else
            return countZeros(input/10);

    }


    public static void main(String[] args) {

        int input = 40202;
        System.out.println(countZerosRec(input));
        System.out.println(countZeros(input));
    }
}
