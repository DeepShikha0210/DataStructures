package LinkedList2;

import LinkedList1.LinkedListNode;

public class SwapEveryPair {

    public static LinkedListNode<Integer> swapEveryPair(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> prev = head;
        LinkedListNode<Integer> curr = head.next;
        head = curr;

        // Traverse the list
        while (true) {
            LinkedListNode<Integer> next = curr.next;
            curr.next = prev; // Change next of current as previous node

            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }

            // Change next of previous to next next
            prev.next = next.next;

            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return head;
    }
}
