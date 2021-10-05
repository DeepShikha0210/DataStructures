package Stacks;

import java.util.Stack;

public class MinimumBracketReversal {

    public static int countBracketReversals(String input){

        int n = input.length();

        if(n == 0)
            return 0;

        if(n%2 != 0)
            return -1;

        Stack<Character> stack = new Stack<>();
        for(int i =0; i < n; i++){

            char c = input.charAt(i);

            if(c == '{')
                stack.push(c);

            else{
                if(!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(c);
                }
            }

        int count = 0;

        while(!stack.isEmpty()){
            char c1 = stack.pop();
            char c2 = stack.pop();

            if(c1 != c2)
                count+=2;

            else if(c1 == c2)
                count+=1;
        }

        return count;
    }
}
