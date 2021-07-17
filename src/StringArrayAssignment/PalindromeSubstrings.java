package StringArrayAssignment;

public class PalindromeSubstrings {

    public static int countPalindromeSubstrings1(String s) {  //O(n^3)
        // Write your code here

        int count =0;
        for(int i = 0; i < s.length(); i++)
            for(int j =i+1; j <= s.length(); j++){
                if(checkPalindrome(s.substring(i,j)))
                    count++;
            }
        return count;
    }

    public static int countPalindromeSubstrings2(String s) {
        // Write your code here

       int count=0;

       for(int i =0; i< s.length(); i++){
           int left = i - 1;
           int right = i + 1;
           count++;
               while (left >= 0 && right < s.length()) {
                   if (s.charAt(left) == s.charAt(right)) {
                       count++;
                       left--;
                       right++;
                   }
                   else
                      break;
               }

               if(i< s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                   left = i-1;
                   right= i+2;

                   count++;
                   while (left >= 0 && right < s.length()) {
                       if (s.charAt(left) == s.charAt(right)) {
                           count++;
                           left--;
                           right++;
                       }
                       else
                           break;
                   }
               }
           }
       return count;
    }



    public static boolean checkPalindrome(String a){
        return new StringBuilder(a).reverse().toString().equals(a);
    }

    public static void main(String[] args) {
        System.out.println(countPalindromeSubstrings2("aba"));

    }
}
