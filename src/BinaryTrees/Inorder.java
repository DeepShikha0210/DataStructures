package BinaryTrees;

public class Inorder {

    public static void inorder(BinaryTreeNode<Integer> root){
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
}
