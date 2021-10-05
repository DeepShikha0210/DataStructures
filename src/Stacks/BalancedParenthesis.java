package Stacks;
import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isBalanced(String expression) {

        if(expression.length()%2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < expression.length(); i++){

            char bracket = expression.charAt(i);

            if(bracket == '('){
                stack.push(bracket);
            }

            else if(bracket == ')' && !stack.isEmpty()){

                if(stack.peek() != '(')
                    return false;

                else
                    stack.pop();

            }

            else if(stack.isEmpty())
                return false;

        }

        if(!stack.isEmpty())
            return false;

        return true;
    }
}
