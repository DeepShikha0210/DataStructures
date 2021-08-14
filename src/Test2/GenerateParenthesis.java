package Test2;

public class GenerateParenthesis {

    public static void printWellFormedParanthesis( int n){

        // Write your code here
        generateParenthesis( n, n, "");
    }

    public static void generateParenthesis(int open, int close, String output){

        if(close == 0 && open==0)
            System.out.println(output);

        if(open > close)
            return;

        if(open>0)
            generateParenthesis(open-1, close, output+"(");

        if (close > 0)
            generateParenthesis(open, close-1, output + ")");

    }

    public static void main(String[] args) {
        printWellFormedParanthesis(3);
    }
}
