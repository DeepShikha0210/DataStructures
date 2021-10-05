package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void evaluatePostfix(String input){

        String result = "";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i< input.length(); i++){

            char c = input.charAt(i);

            if (Character.isLetterOrDigit(c))  //If the scanned char is an operand
                result += c;

            else if(c == '(')  //open bracket, push to stack
                stack.push(c);

            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '(')
                    result+=stack.pop();

                stack.pop();


            }

            else {  //is an operator
                while(!stack.isEmpty() && !(hasHigherPrecedence(c, stack.peek()))){
                    result+=stack.pop();
                }

                stack.push(c);
            }



        }

        while(!stack.isEmpty())
            result+=stack.pop();

        int postfix = postfixExpression(result);

        System.out.println(result);
        System.out.println(postfix);

    }

    public static int postfixExpression(String postfix){

        Stack<Integer> stack = new Stack<>();
        for(int  i =0; i < postfix.length(); i++){

            char c = postfix.charAt(i);

            if (Character.isDigit(c))
                stack.push(c - '0');

            else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c) {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }

        }
        return stack.pop();
    }


    static boolean hasHigherPrecedence(char a , char b){
        return checkPrecedence(a) > checkPrecedence(b);

    }

    static int checkPrecedence(char c){

        switch(c){

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;

    }
}
