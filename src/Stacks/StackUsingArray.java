package Stacks;

public class StackUsingArray {

    private static int[] stack;
    private static int top;

    public StackUsingArray() {
        stack = new int[10];
        top =-1;
    }

    public StackUsingArray(int capacity){
        stack = new int[capacity];
        top =-1;
    }

    public static boolean isEmpty(){
        return (top == -1);     // stack.length == 0
    }

    public static int size(){
        return top+1;
    }

    public static int peek() throws StackEmptyException{
        if(size() == 0) {
            //throw exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return stack[top];
    }

    public static void push(int element) throws StackFullException{

        if(size() == stack.length)
        {
           doubleCapacity();
        }
        top++;
        stack[top] = element;
    }

    public static void doubleCapacity(){

        int[] temp = stack;
        stack = new int[2*temp.length];
        for(int i =0; i <= top; i++)
            stack[i] = temp[i];

    }

    public static int pop() throws StackEmptyException{
        if(size() == 0){

            StackEmptyException e = new StackEmptyException();
            throw e;
        }

        int popped = stack[top];
        top--;
        return popped;
    }







    public static void main(String[] args) {
        stack = new int[10];


    }

}
