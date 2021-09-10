package LinkedList1;

public class PrintNode {
    public static void printIthNode(LinkedListNode<Integer> head, int i){
        //Your code goes here
        int pointer= -1;

        while(head != null){
            pointer++;
            if(pointer == i){
                System.out.print(head.data);
                return;
            }
            head= head.next;
        }

    }
}
