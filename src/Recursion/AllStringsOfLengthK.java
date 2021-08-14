package Recursion;

public class AllStringsOfLengthK {

    public static String[] allStrings(String charSet, int len){
        if(len == 0) {
            String[] arr = {""};
            return arr;
        }

        String[] smallAns = allStrings(charSet, len-1);
        String[] ans = new String[smallAns.length * charSet.length()];
        int k =0;
        for (int i =0; i < charSet.length(); i++){
            for (int j =0; j< smallAns.length; j++){
                ans[k++] = charSet.charAt(i) + smallAns[j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] ans = allStrings("abc", 2);
        for (String s: ans)
            System.out.println(s);

    }
}
