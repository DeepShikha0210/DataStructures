package BinaryTrees;

import java.util.HashMap;

public class ConstructTree1 {

    static int pIndex = 0;

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        for(int i=0; i < inOrder.length; i++)
            map.putIfAbsent(inOrder[i] , i);

        return construct(0, inOrder.length-1, preOrder);
    }

    public static BinaryTreeNode<Integer> construct(int start, int end, int[] preOrder) {

        if(start > end || pIndex == preOrder.length)
            return null;

        BinaryTreeNode<Integer> root = new  BinaryTreeNode<Integer>(preOrder[pIndex++]);
        int iIndex = map.get(root.data);

        root.left  =construct( start , iIndex-1 , preOrder);
        root.right =construct(iIndex + 1, end, preOrder);

        return root;
    }
}
