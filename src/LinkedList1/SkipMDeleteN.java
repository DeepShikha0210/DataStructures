package LinkedList1;

public class SkipMDeleteN {
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        //Your code goes here
        LinkedListNode<Integer> current = head, joinNode = null, prev = null;

        if(M == 0 )
            return null;

        if(N == 0)
            return head;

        int t1, t2;

        while(current != null){

            t1 = 0;
            t2 = 0;

            while(t1 < M && current != null){
                prev = current;
                current = current.next;
                t1++;
            }

            joinNode = prev;
            while(t2 < N && current != null){
                current = current.next;
                t2++;
            }

            joinNode.next = current;
        }

        return head;
    }
}
