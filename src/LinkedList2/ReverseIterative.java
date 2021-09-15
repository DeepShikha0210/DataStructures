package LinkedList2;

import LinkedList1.LinkedListNode;

public class ReverseIterative {

    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){

        if(head == null || head.next == null)
            return head;

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null, temp;

        while(curr != null){

            temp =curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
        }
        return prev;

    }

}
