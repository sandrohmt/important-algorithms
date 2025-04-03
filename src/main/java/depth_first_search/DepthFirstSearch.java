package depth_first_search;

public class DepthFirstSearch {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this. val = val;
            this.left = this.right = null;
        }
    }

        public static void dfs(TreeNode node) {
            if (node == null) return;

            System.out.println(node.val + "");

            dfs(node.left);
            dfs(node.right);
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("DFS Pré-Ordem da árvore:");
        dfs(root);
    }
}
