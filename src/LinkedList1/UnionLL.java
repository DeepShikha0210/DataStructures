package LinkedList1;

public class UnionLL {

    public static ListNode<Integer> Union(ListNode<Integer> head1, ListNode<Integer> head2){
        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        ListNode<Integer> head = new ListNode<>(0), temp;
        temp = head;
        while(head1 != null && head2 != null){

            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }

            else if(head1.data > head2.data){
                temp.next = head2;
                head2 = head2.next;
            }

            else{
                temp.next = head1;
                head1 = head1.next;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        if(head1 != null){
            temp.next = head1;
        }

        if(head2 != null){
            temp.next = head2;
        }

        return head.next;

    }

    public static ListNode<Integer> mergeSort(ListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null)
            return head;

        ListNode<Integer> fast = head, slow = head;

        while(fast.next != null && fast.next.next != null){   //returns the first mid in even case

            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode<Integer> right = mergeSort(slow.next);
        slow.next = null;
        ListNode<Integer> left = mergeSort(head);


        ListNode<Integer> newHead = mergeSortedList(left , right);

        return newHead;

    }

    public static ListNode<Integer> mergeSortedList(ListNode<Integer> head1, ListNode<Integer> head2){

        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        ListNode<Integer> ans = null;

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
