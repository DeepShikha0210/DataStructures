package Recursion;

public class PrintSubsequences {
    public static void printSubsequences(String input){
        printSubsequences(input, "");
    }

    public static void printSubsequences(String input, String output){ //xyz , " "

        if(input.length() == 0){
            System.out.println(output);
            return;
        }

        //We choose not to include first character
        printSubsequences(input.substring(1),output );                          // yz , ' '
        //We choose to include first character
        printSubsequences(input.substring(1), output+input.charAt(0));   //  yz , 'x'
    }

}
