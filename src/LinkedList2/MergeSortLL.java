package LinkedList2;

import LinkedList1.LinkedListNode;

public class MergeSortLL {

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null)
            return head;

        LinkedListNode<Integer> fast = head, slow = head;

        while(fast.next != null && fast.next.next != null){   //returns the first mid in even case

            slow = slow.next;
            fast = fast.next.next;

        }

        LinkedListNode<Integer> right = mergeSort(slow.next);
        slow.next = null;
        LinkedListNode<Integer> left = mergeSort(head);


        LinkedListNode<Integer> newHead = mergeSortedList(left , right);

        return newHead;

    }

    public static LinkedListNode<Integer> mergeSortedList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){

        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        LinkedListNode<Integer> ans = null;

        if (head1.data <= head2.data) {
            ans = head1;
            ans.next = mergeSortedList(head1.next, head2);
        }
        else {
            ans = head2;
            ans.next = mergeSortedList(head1, head2.next);
        }
        return ans;

    }
}
