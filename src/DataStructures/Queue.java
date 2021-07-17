package DataStructures;

import java.util.LinkedList;

public class Queue
{

    public static void main(String[] args) {
        java.util.Queue<String> queue = new LinkedList<String>();

        queue.add("Deep");
        queue.add("Prii");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
