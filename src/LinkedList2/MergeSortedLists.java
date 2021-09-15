package LinkedList2;

import LinkedList1.LinkedListNode;

public class MergeSortedLists {
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        LinkedListNode<Integer> head3 = null, tail3 = null;

        while(head1 != null && head2 != null){

            if(head1.data <= head2.data){

                if(head3 == null){
                    head3 = head1;
                    tail3 = head1;
                }

                else{
                    tail3.next = head1;
                    tail3 = tail3.next;
                }
                head1 = head1.next;
            }

            else{
                if(head3 == null){
                    head3 = head2;
                    tail3 = head2;
                }

                else{
                    tail3.next = head2;
                    tail3 = tail3.next;
                }
                head2 = head2.next;
            }
        }

        if(head1 == null)
            tail3.next = head2;

        if(head2 == null)
            tail3.next = head1;

        return head3;
    }

}
