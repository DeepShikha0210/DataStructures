package Recursion;

import java.util.ArrayList;

public class AllStringsOfLengthK2 {
    static ArrayList<String> answer = new ArrayList<>();

    public static String[] allStrings(String charSet, int len){

        // Write your code here
        allStrings(charSet, "", len);
        String[] ans = new String[answer.size()];
        for (int i =0; i< answer.size();i++)
            ans[i] = answer.get(i);
        return ans;
    }

    public static void allStrings(String charSet, String output, int len){

        if(len == 0) {
            answer.add(output);
            return;
        }

        for(int i=0;i<charSet.length();i++)
            allStrings(charSet, output+charSet.charAt(i), len-1);

    }

    public static void main(String[] args) {
        String[] ans = allStrings("abc", 2);

        for (String s : ans)
            System.out.println(s);
    }
}
