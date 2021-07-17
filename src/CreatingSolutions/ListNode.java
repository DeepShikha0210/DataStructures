package CreatingSolutions;

public class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

//class Node {
//        public int key;
//        public int val;
//        public Node prev;
//        public Node next;
//
//        public Node(int key, int val) {
//            this.key = key;
//            this.val = val;
//            prev = null;
//            next = null;
//        }