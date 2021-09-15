package LinkedList2;

import LinkedList1.Node;

public class ReverseRecursively {

    public static Node<Integer> reverseR(Node<Integer> head){  //T(n) = T(n-1) + (n-1)   //O(n2)
        if(head == null || head.next == null)
            return head;

        Node<Integer> newHead = reverseR(head.next);
        Node<Integer> temp = newHead;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = head;
        head.next = null;

        return newHead;
    }

    public static DoubleNode reverseRBetter(Node<Integer> head){   //T(n) = T(n-1) + k   //O(n)
        if(head == null || head.next == null){

            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        DoubleNode finalHead = reverseRBetter(head.next);
        finalHead.tail.next = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();
        ans.head = finalHead.head;
        ans.tail = head;

        return ans;

    }

    public static Node<Integer> reverseRBest(Node<Integer> head) {   //T(n) = T(n-1) + k   //O(n)

        if(head == null || head.next == null)
            return head;

        Node<Integer> tail = head.next;
        Node<Integer> newHead = reverseRBest(head.next);
        tail.next = head;
        head.next = null;

        return newHead;
    }

}
