package LinkedList1;

public class KReverse {
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        //Your code goes here

        if(head == null)
            return null;

        if(k == 0 || k==1)
            return head;

        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null;

        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            head.next = kReverse(next, k);

        // prev is now head of input list
        return prev;

    }

    public static LinkedListNode<Integer> kReverseIterative(LinkedListNode<Integer> head, int k) {
        //Your code goes here

        if(k == 0 || k==1)
            return head;

        int pointer;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> newHead = null, joiningNode = null, tail = null;

        while(current != null){

            joiningNode = current;
            pointer = 0;
            prev = null;

            while(current != null && pointer < k){

                next= current.next;
                current.next = prev;
                prev = current;
                current = next;
                pointer++;
            }

            if(newHead == null)
                newHead = prev;

            if(tail != null)
                tail.next = prev;

            tail = joiningNode;

        }

        return newHead;
    }
}
