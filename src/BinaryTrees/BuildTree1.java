package BinaryTrees;

public class BuildTree1 {

    public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS, int inE, int preS, int preE) {
        if (inS > inE) {
            return null;
        }
        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootInIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (in[i] == rootData) {
                rootInIndex = i;
                break;
            }
        }
        if (rootInIndex == -1) {
            return null;
        }

        int leftInS = inS;
        int leftInE = rootInIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootInIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;
        root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int in[], int pre[]) {
        return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length -1);
    }
}
