package LinkedList1;

public class InsertNode {

    public static Node insert(Node<Integer> head, int data, int pos){

        Node<Integer> newNode = new Node<>(data);
        if(pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node<Integer> temp = head;
        int pointer = 0;
        while(pointer < pos -1){
            temp = temp.next;
            pointer++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

}
