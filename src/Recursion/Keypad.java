package Recursion;

public class Keypad {


    // Return a string array that contains all the possible strings
    public static String[] keypad(int n){
        // Write your code here

        if(n == 0) {
            String[] ans = {""};
            return ans;
        }

        String[] smallAns = keypad(n/10);
        String combo = helper(n%10);
        String[] ans = new String[combo.length()*smallAns.length];
        int k =0;
        for(int i=0; i < smallAns.length; i++){
            for (int j =0; j< combo.length(); j++) {
                ans[k] = smallAns[i] + combo.charAt(j);
                k++;
            }
        }
        return ans;
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
        String[] ans = keypad(234);
        for(String i : ans)
            System.out.println(i);
    }

}
