package Stacks;

import java.util.ArrayDeque;
import java.util.Queue;


public class StackUsingTwoQueues {

        //Define the data members
        Queue<Integer> q1, q2;
        int size;

        public StackUsingTwoQueues() {
            //Implement the Constructor
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
            size = 0;
        }

        /*----------------- Public Functions of Stack -----------------*/


        public int getSize() {
            //Implement the getSize() function
            return size;
        }

        public boolean isEmpty() {
            //Implement the isEmpty() function
            return (getSize()==0);
        }

        public void push(int element) {
            //Implement the push(element) function
            // Move all elements from the first queue to the second queue
            while (!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.poll();
            }
            // Push the given item into the first queue
            q1.add(element);
            size++;

            // Move all elements back to the first queue from the second queue
            while (!q2.isEmpty())
            {
                q1.add(q2.peek());
                q2.poll();
            }
        }

        public int pop() {
            //Implement the pop() function
            // if the first queue is empty
            if (q1.isEmpty())
                return -1;

            // return the front item from the first queue
            int front = q1.peek();
            q1.poll();
            size--;

            return front;
        }


        public int top() {
            //Implement the top() function
            if(getSize() == 0)
                return -1;

            return q1.peek();
        }
    }