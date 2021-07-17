package Recursion;

import java.util.ArrayList;

public class PrintStringSubsequencesProblem {

    static ArrayList<String> result = new ArrayList<>();

    public static ArrayList<String> stringSubsequences(String input){

        String output = "";
        helper(input, output);
        return result;
    }

    public static void helper(String input, String output){

        if(input.length() == 0){
            result.add(output);
            return;
        }

        helper(input.substring(1),output );
        helper(input.substring(1), output+input.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(stringSubsequences("ABC"));
    }
}
