package LinkedList1;

public class LastToFront {
    public static ListNode<Integer> lastToFront(ListNode<Integer> head) {

        ListNode<Integer> prev = null, current = head;

        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;
        current.next = head;

        return current;

    }
}
