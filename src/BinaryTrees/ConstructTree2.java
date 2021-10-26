package BinaryTrees;

import java.util.HashMap;

public class ConstructTree2 {

    static int pIndex;

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {

        pIndex = postOrder.length-1;
        for(int i=0; i < inOrder.length; i++)
            map.putIfAbsent(inOrder[i] , i);

        return construct(0, inOrder.length-1, postOrder);

    }

    public static BinaryTreeNode<Integer> construct(int start, int end, int[] postOrder){

        if(start > end || pIndex == postOrder.length)
            return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postOrder[pIndex--]);

        int iIndex = map.get(root.data);


        root.right =construct(iIndex + 1, end, postOrder);    //? why root.right before root.left
        root.left  =construct( start , iIndex-1 , postOrder);

        return root;

    }
}
