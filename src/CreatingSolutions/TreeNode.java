package CreatingSolutions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

// public static TreeNode insert(TreeNode root, int x) {
//        if (root == null)
//            return new TreeNode(x);
//        if (x < root.val)
//            root.left = insert(root.left, x);
//        else if (x > root.val)
//            root.right = insert(root.right, x);
//        return root;
//    }