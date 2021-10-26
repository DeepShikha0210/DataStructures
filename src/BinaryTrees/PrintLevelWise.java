package BinaryTrees;

import Stacks.QueueEmptyException;
import Stacks.QueueUsingLL;

public class PrintLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = null;
            try {
                frontNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
            System.out.print(frontNode.data + ":");
            if (frontNode.left != null) {
                pendingNodes.enqueue(frontNode.left);
                System.out.print("L:" + frontNode.left.data + ",");
            } else {
                System.out.print("L:" + "-1" + ",");
            }
            if (frontNode.right != null) {
                pendingNodes.enqueue(frontNode.right);
                System.out.print("R:" + frontNode.right.data);
                System.out.println();
            } else {
                System.out.print("R:" + "-1");
                System.out.println();
            }
        }
    }
}
