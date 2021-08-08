package Recursion;

public class StringPalindrome {

    public static boolean isStringPalindrome(String input) {
        // Write your code here

        if(input.length() == 1)
            return true;

        return helper(input, 0 , input.length()-1);
    }

    static boolean helper(String input, int start, int end){
        if(start == end || start > end)
            return true;

        if(input.charAt(start) != input.charAt(end))
            return false;

        return helper(input, start+1, end-1);
    }


    public static void main(String[] args) {

        System.out.println(isStringPalindrome("ninja"));
        System.out.println(isStringPalindrome("racecar"));

    }
}
