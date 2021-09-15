package LinkedList2;

import LinkedList1.Node;

public class MoveToLast {
    public static Node<Integer> func(Node<Integer> head, int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        Node<Integer> curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        Node<Integer> end = curr, edge = curr, temp = null;

        Node<Integer> prev= null;
        curr = head;

        while(curr != edge){

            if(curr.data == n){

                if(prev == null){

                    head = head.next;
                    temp = curr.next;
                    end.next= curr;
                    prev = temp;
                    curr = temp.next;
                    end = end.next;

                }

                else{

                    temp = curr.next;
                    end.next = curr;
                    prev.next = temp;
                    curr = temp;
                    end = end.next;

                }
            }

            else {
                prev = curr;
                curr = curr.next;
            }
        }
        if(end != null)
            end.next = null;

        return head;

    }

}
