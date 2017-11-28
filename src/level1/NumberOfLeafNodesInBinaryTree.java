package level1;

public class NumberOfLeafNodesInBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(9);
        int numberOfLeaves = numberOfLeaves(treeNode);
        System.out.println(numberOfLeaves);
    }

    public static int numberOfLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right==null) {
            return 1;
        } else {
            return numberOfLeaves(root.left) + numberOfLeaves(root.right);
        }
    }

    private static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }
}
