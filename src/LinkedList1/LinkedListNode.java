package LinkedList1;

public class LinkedListNode<T> {

    public T data;
    public LinkedListNode<Integer> next;

    public LinkedListNode(T data){
        this.data = data;
        next = null;
    }
}
