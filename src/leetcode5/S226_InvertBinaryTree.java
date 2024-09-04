package leetcode5;

public class S226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode answerNode = new TreeNode(root.val);
        invert(root, answerNode);
        return answerNode;
    }

    private void invert(TreeNode origin, TreeNode convert) {
        if (origin.left != null) {
            convert.right = new TreeNode(origin.left.val);
            invert(origin.left, convert.right);
        }
        if (origin.right != null) {
            convert.left = new TreeNode(origin.right.val);
            invert(origin.right, convert.left);
        }
    }
}
/*
Given the root of a binary tree, invert the tree, and return its root.



Example 1:


Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:


Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []

 */