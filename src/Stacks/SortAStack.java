package Stacks;

import java.util.Stack;

public class SortAStack {

    public static void sortStack(Stack<Integer> stack){

        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(stack.pop());

        while(!stack.isEmpty()){

            int current = stack.pop();
            while(!tempStack.isEmpty() && current < tempStack.peek()){
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }

        while(!tempStack.isEmpty())
            stack.push(tempStack.pop());

    }
}
