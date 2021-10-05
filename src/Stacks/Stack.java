package Stacks;


/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
    private Node head;
    private int size;

    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (head == null);
    }

    public void push(int data) {
        //Implement the push(element) function
        Node top = new Node(data);
        top.next = head;
        head = top;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(head == null)
            return -1;

        int popped = (int) head.data; //no need to cast int
        size--;
        head= head.next;

        return popped;
    }

    public int top() {
        //Implement the top() function
        if(head == null)
            return -1;

        return (int) head.data; //no need to cast int
    }
}
