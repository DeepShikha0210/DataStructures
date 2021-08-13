package Recursion;

public class PrintKeypad {
    public static void printKeypad(int input){
        printKeypad(input, "");
    }

    public static void printKeypad(int num, String output){

        if(num == 0){
            System.out.println(output);
            return;
        }


        String letters = helper(num%10);
        for(int i=0; i< letters.length(); i++){
            printKeypad(num/10,letters.charAt(i)+output );
        }

    }

    private static String helper(int n){
        if(n==2)
            return "abc";
        if(n==3)
            return "def";
        if(n==4)
            return "ghi";
        if(n==5)
            return "jkl";
        if(n==6)
            return "mno";
        if(n==7)
            return "pqrs";
        if(n==8)
            return "tuv";
        if(n==9)
            return "wxyz";
        else
            return "";
    }

    public static void main(String[] args) {
        printKeypad(234);
    }

}
