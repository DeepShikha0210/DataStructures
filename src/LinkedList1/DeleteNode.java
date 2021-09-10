package LinkedList1;

public class DeleteNode {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        // Write your code here.

        if(head == null || head.next == null)
            return null;


        if(pos == 0){
            head = head.next;
            return head;
        }

        int pointer =0;
        LinkedListNode<Integer> temp = head;
        while(pointer < pos-1){
            temp = temp.next;
            pointer++;

            if(temp == null || temp.next == null)
                return head;
        }


        temp.next = temp.next.next;


        return head;
    }
}
