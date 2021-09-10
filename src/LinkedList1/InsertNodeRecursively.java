package LinkedList1;

public class InsertNodeRecursively {
    public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){

        if(pos == 0){
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer> (data);
            newNode.next = head ;
            return newNode;
        }

        if(head == null)
            return null;

        head.next = insertR(head.next, data, pos-1);
        return head;
    }
}
