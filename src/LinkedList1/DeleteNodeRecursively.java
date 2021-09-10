package LinkedList1;

public class DeleteNodeRecursively {
    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (pos == 0) {
            return head.next;
        }
        if (head.next == null) {
            return head;
        }
        head.next = deleteNodeRec(head.next, pos - 1);
        return head;

    }
}
