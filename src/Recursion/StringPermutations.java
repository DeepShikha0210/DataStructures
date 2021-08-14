package Recursion;

public class StringPermutations {

    // Function to print all the permutations of str
    public static void permutations(String input){
        // Write your code here
        permutations(input, "");
    }

    public static void permutations(String str, String ans) {

        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding 
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recurvise call
            permutations(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args) {
        String s = "abb";
        permutations(s);
    }
}