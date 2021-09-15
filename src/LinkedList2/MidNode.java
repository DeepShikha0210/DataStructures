package LinkedList2;

import LinkedList1.LinkedListNode;

public class MidNode {
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {


        if(head == null || head.next == null)
            return head;
        //Your code goes here
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while(fast.next != null && fast.next.next != null){   //returns the first mid in even case

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

}
