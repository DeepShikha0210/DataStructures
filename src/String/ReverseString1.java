package String;

public class ReverseString1 {

    public static String reverseWordWise(String input) {
        // Write your code here
       /* String rev= "";
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < input.length(); i++ ){
            if(input.charAt(i) == ' '){
                rev= input.substring(wordIndex, i) + "\t" + rev;
                wordIndex = i+1;
            }
            else if(i == input.length()-1){
                rev= input.substring(wordIndex) + "\t" + rev;
            }
        }
        return rev.trim();
        */

        String[] words = input.split("\\s");
        String outputString = "";
        for (int i = words.length-1; i >= 0; i--)
            outputString = outputString + words[i] + " ";

        return outputString;
    }

    public static void main(String[] args) {
        System.out.println(reverseWordWise("You are love"));
            }
}
