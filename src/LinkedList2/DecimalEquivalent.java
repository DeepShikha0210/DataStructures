package LinkedList2;

import LinkedList1.Node;

public class DecimalEquivalent {


    public static int decimalEquivalent(Node<Integer> head) {

        int length = 0;
        int value = 0;

        Node<Integer> curr = head;
        while(curr != null){

            curr= curr.next;
            length++;
        }

        curr = head;

        while(curr != null){

            if(curr.data == 1)
                value+= Math.pow(2, length-1);

            curr = curr.next;
            length--;
        }

        return value;
    }

    public static int decimal(Node<Integer> head){
        int ans =0;
        while(head != null){
            ans = (ans << 1) + head.data;
            head= head.next;
        }
        return ans;
    }
}
