package StringArrayAssignment;

public class LargestUniqueSubstring {

    public static String findLargestUniqueSubstring(String str){
        if(str.length() == 0)
            return "";

        int lastIndex[] = new int[256];
        for(int i =0; i< lastIndex.length; i++){
            lastIndex[i] =-1;
        }
        int currentSubstringStart = 0;
        int maxSubstringStart = 0;
        int maxSubstringEnd = 0;
        int maxSubstringLength =1;
        for(int i=0; i< str.length();i++){
            char currentChar = str.charAt(i);
            if(lastIndex[currentChar] >= currentSubstringStart){
                if(i-currentSubstringStart > maxSubstringLength){
                    maxSubstringStart=currentSubstringStart;
                    maxSubstringEnd = i-1;
                    maxSubstringLength=i-currentSubstringStart;
                }
                currentSubstringStart = lastIndex[currentChar]+1;
            }
            lastIndex[currentChar]=i;
        }

        if(str.length() - currentSubstringStart > maxSubstringLength){
            maxSubstringStart=currentSubstringStart;
            maxSubstringEnd = str.length()-1;
            maxSubstringLength = str.length() - currentSubstringStart;
        }

        return str.substring(maxSubstringStart, maxSubstringEnd+1);
    }

    public static void main(String[] args) {
        System.out.println(findLargestUniqueSubstring("abcdabceb"));
    }
}
