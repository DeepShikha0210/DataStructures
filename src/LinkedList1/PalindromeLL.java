package LinkedList1;

public class PalindromeLL {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {

        if(head == null)
            return true;

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode<Integer> current = slow;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next = null;

        while(current != null){
            next= current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        LinkedListNode<Integer> newHead = prev;

        while(head != slow){
            if(head.data != newHead.data)
                return false;
            head= head.next;
            newHead = newHead.next;
        }

        return true;


    }
}
