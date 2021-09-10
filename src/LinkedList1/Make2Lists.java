package LinkedList1;

public class Make2Lists {

    public static void make2List(ListNode<Integer> head) {

        if(head == null)
            return;

        if(head.next == null){
            System.out.print(head.data);
            return;
        }

        ListNode<Integer> head1 = null, head2 = null, tail1= null, tail2= null;
        ListNode<Integer> prev1 = null, prev2 = null, current = head, temp1 = null, temp2 = null;

        while(current != null){

            if(tail1 == null){
                tail1 = current;
                head1= current;
                prev1 = head1;
            }

            temp1 = current.next;
            head1 = current;
            head1.next = prev1;
            prev1 = head1;

            temp2 = temp1.next;

            if(tail2 == null){
                tail2 = temp1;
                head2 = temp1;
                prev2 = head2;
            }

            head2  = temp1;
            head2.next = prev2;
            prev2 = head2;

            current = temp2;

        }

        if (tail1 != null)
            tail1.next = null;

        if(tail2 != null)
            tail2.next = null;


        while(head1 != null){
            System.out.print(head1.data + " ");
            head1 = head1.next;
        }

        System.out.println();

        while(head2 != null){
            System.out.print(head2.data + " ");
            head2 = head2.next;
        }

    }
}
