package level2;

import java.util.ArrayList;

public class IterativePreOrderTraversalOfBinaryTree {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(9);
        ArrayList<Integer> preorderItr = preorderItr(treeNode);
        System.out.println(preorderItr);
    }

    public static ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        preOrder(root, lst);
        return lst;
    }

    private static void preOrder(TreeNode node, ArrayList<Integer> lst) {
        if(node != null){
            lst.add(node.data);
            preOrder(node.left, lst);
            preOrder(node.right, lst);
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
