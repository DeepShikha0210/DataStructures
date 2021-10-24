package Trees;

public class ReplaceNodeWithDepth {

    public static void replaceWithDepthValue(TreeNode<Integer> root) {
        replaceWithDepthValue(root, 0);
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root, int depth) {
        if (depth == 0) {
            root.data = depth;
        }
        root.data = depth;
        for (int i = 0; i < root.children.size(); i++) {
            replaceWithDepthValue(root.children.get(i), depth + 1);
        }
    }
}
