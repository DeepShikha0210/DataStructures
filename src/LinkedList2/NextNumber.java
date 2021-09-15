package LinkedList2;

import LinkedList1.LinkedListNode;

public class NextNumber {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {  //Intuitive Approach

        LinkedListNode<Integer> curr = head, last = null;

        while(curr.next != null){

            if(curr.data != 9)
                last = curr;

            curr = curr.next;
        }

        if(curr.data != 9){
            curr.data++;
            return head;
        }

        if(last == null){

            last = new LinkedListNode<Integer>(null);
            last.data = 0;
            last.next = head;
            head = last;

        }

        last.data++;
        last = last.next;

        while(last != null){
            last.data = 0;
            last= last.next;
        }

        return head;


    }
    public static LinkedListNode<Integer> nextNumber(LinkedListNode<Integer> head) { //Using carry method

        if( head == null)
            return head;


        LinkedListNode<Integer> newHead = reverseLL(head);
        LinkedListNode<Integer> curr = newHead;

        int carry = 1, value = 0;

        while(curr != null){

            value = carry + curr.data;
            curr.data = value%10;
            carry = value/10;
            curr= curr.next;

        }

        if(carry > 0){

            LinkedListNode<Integer> tail = new  LinkedListNode<Integer>(carry);
            curr = tail;
            tail.next = null;
        }



        return reverseLL(newHead);

    }

    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {

        if (head == null || head.next == null)
            return head;

        LinkedListNode<Integer> prev =null, curr = head, temp = null;

        while(curr != null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        return prev;
    }


}
