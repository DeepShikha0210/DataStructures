package LinkedList1;

public class LengthOfLL {
    public static int length(LinkedListNode<Integer> head){

        int length = 0;
        while(head != null){
            length++;
            head= head.next;
        }
        return length;
    }

    public static int lengthRecursive(LinkedListNode<Integer> head){
        if(head == null)
            return 0;
        return 1 + length(head.next);
    }
}
