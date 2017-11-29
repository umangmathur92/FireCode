package level2;

import java.util.ArrayList;

public class IterativePreOrderTraversalOfBinaryTree {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> preorderItr(TreeNode root) {

        return null;
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
