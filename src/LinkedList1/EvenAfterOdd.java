package LinkedList1;

public class EvenAfterOdd {

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> oddHead = null, evenHead = null, oddTail= null, evenTail = null;
        LinkedListNode<Integer> current = head;


        while(current != null){

            if(current.data %2 == 0){

                if(evenHead == null){
                    evenHead = current;
                    evenTail = current;

                }
                else{
                    evenTail.next = current;
                    evenTail = evenTail.next;

                }
            }

            else{
                if(oddHead == null){
                    oddHead = current;
                    oddTail = current;
                }
                else{
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }

        if (oddHead != null)
        {
            head = oddHead;
            oddTail.next = evenHead;
        }

        else {
            head = evenHead;
        }

        if (evenTail != null) {
            evenTail.next = null;
        }


        return head;
    }

}
