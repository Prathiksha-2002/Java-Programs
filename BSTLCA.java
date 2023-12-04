class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class BSTLCA {
    TreeNode root;

    public TreeNode findLCA(TreeNode root, int node1, int node2) {
        if (root == null) {
            return null;
        }

        // If both nodes are smaller, LCA is in the left subtree
        if (root.value > node1 && root.value > node2) {
            return findLCA(root.left, node1, node2);
        }
        // If both nodes are larger, LCA is in the right subtree
        else if (root.value < node1 && root.value < node2) {
            return findLCA(root.right, node1, node2);
        }
        // If one value is smaller and the other is larger, or one of them matches the current root
        else {
            return root;
        }
    }

    public static void main(String[] args) {
        BSTLCA tree = new BSTLCA();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(30);
        tree.root.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(15);
        tree.root.right.left = new TreeNode(25);
        tree.root.right.right = new TreeNode(35);

        int node1 = 10;
        int node2 = 30;

        TreeNode lca = tree.findLCA(tree.root, node1, node2);

        System.out.println("Lowest Common Ancestor: " + lca.value);
    }
}


