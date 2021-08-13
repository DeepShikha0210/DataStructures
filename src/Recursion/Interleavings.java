package Recursion;

public class Interleavings {
    public static void interleavings(String first, String second){

        // Write your code here
        interleavings(first, second, "");
    }

    public static void interleavings(String s1, String s2, String s3){

        if(s1.length() == 0 ){
            System.out.println(s3+s2);
            return;
        }
        if(s2.length() == 0 ){
            System.out.println(s3+s1);
            return;
        }

        interleavings(s1.substring(1), s2, s3+s1.charAt(0));
        interleavings(s1, s2.substring(1), s3+s2.charAt(0));
    }

    public static void main(String[] args) {
        interleavings("abc", "def");
    }
}
