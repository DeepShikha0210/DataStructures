package Recursion;

public class RecursionWithString {

    static String replaceChar(String s, char a, char b){

        if(s.length() == 0)
            return s;

        if(s.charAt(0) == a)
            return b + replaceChar(s.substring(1), a, b);

        return s.charAt(0) + replaceChar(s.substring(1), a, b);
    }

    public static String removeX(String input){
        // Write your code here

        if(input.length() == 0)
            return input;

        if(input.charAt(0) == 'x')
            return removeX(input.substring(1));

        return input.charAt(0) + removeX(input.substring(1));

    }

    static String replacePi(String s){

        if(s.length() <= 1)
            return s;

        if(s.substring(0,2).equals("pi"))
            return "3.14" + replacePi(s.substring(2)); // recurse back on n-2 length of String

        return s.substring(0,1) + replacePi(s.substring(1));  // recurse back on n-1 length of String
    }


    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <=1)
            return s;

        if(s.charAt(0) == s.charAt(1))
            return removeConsecutiveDuplicates(s.substring(1));

        return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));


    }


    public static void main(String[] args) {
        System.out.println(replaceChar("acxdxdx", 'x', 'y'));
        System.out.println(removeX(("expochersexdx")));
        System.out.println(replacePi("piperpi"));
        System.out.println(removeConsecutiveDuplicates("aabccba"));

    }
}
