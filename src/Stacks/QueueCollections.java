package Stacks;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(2);
        q2.element();
        q2.size();
        q2.isEmpty();
        q2.offer(2);
        q2.poll();

    }
    
}
