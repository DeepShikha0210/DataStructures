package LinkedList2;

import LinkedList1.LinkedListNode;

public class InsertionSortLLgfg {

    static LinkedListNode<Integer> sorted, head;

    public static LinkedListNode<Integer> insertionSort(LinkedListNode<Integer> headref) {


        // Initialize sorted linked list
        sorted = null;
        LinkedListNode<Integer> current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null)
        {
            // Store next for next iteration
            LinkedListNode<Integer> next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        head = sorted;

        return head;
    }

    /*
     * function to insert a new_node in a list. Note that
     * this function expects a pointer to head_ref as this
     * can modify the head of the input linked list
     * (similar to push())
     */
    public static void sortedInsert(LinkedListNode<Integer> newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.data >= newnode.data)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            LinkedListNode<Integer> current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.data < newnode.data)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

}
