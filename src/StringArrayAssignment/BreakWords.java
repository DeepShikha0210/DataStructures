package StringArrayAssignment;

public class BreakWords {
    public static String breakWords(String input) {

        StringBuilder sb = new StringBuilder(input);
        StringBuilder output = new StringBuilder();
        int startIndex = 0;
        for (int i = 0; i <= sb.length(); i++) {
            if ((i == sb.length()) || Character.isWhitespace(sb.charAt(i))) {
                String word = sb.substring(startIndex, i);
                int wordLength = word.length();
                if (wordLength >= 4 && wordLength % 2 == 0) {
                    int mid = wordLength/2;  //4
                    output.append(sb.substring(startIndex, i-mid));
                    output.append(" ");
                    output.append(sb.substring(i-mid, i));
                    if(i != sb.length())
                        output.append(" ");
                }
                else{
                    output.append(word);
                    if(i != sb.length())
                        output.append(" ");
                }

                startIndex = i + 1;
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(breakWords("a abbcdefghi jk lm n opqr stuvwx yba "));

        //a abbcd efghi jk lm n op qr stu vwx yba
    }
}
