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

public class Queue {

    //Define the data members

    private Node rear;
    private Node front;
    int size;

    public Queue() {
        rear = null;
        front = null;
        size = 0;
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (getSize() == 0);
    }


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        Node temp = new Node(data);
        if(getSize() == 0){
            rear =temp;
            front = temp;
        }

        else{
            rear.next = temp;
            rear = rear.next;
        }

        size++;
    }


    public int dequeue() {

        if(getSize() == 0)
            return -1;

        int dequeued = (int) front.data;  //No need to cast to int
        front = front.next;
        size--;

        if(getSize() == 0){
            rear = null;
        }

        return dequeued;
        //Implement the dequeue() function
    }


    public int front() {
        //Implement the front() function
        if(getSize() == 0)
            return -1;

        return (int) front.data;       // No need to cast to int
    }
}
