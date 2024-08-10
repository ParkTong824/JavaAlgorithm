package leetcode3;

public class S110_BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode node = TreeNode.makeTreeNodeSample();
        System.out.println(isBalanced(node));
    }
    public static boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null) ) {
            return true;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        if (root.left != null) {
            leftDepth++;
            leftDepth = checkDepth(root.left, leftDepth);
        }
        if (root.right != null) {
            rightDepth++;
            rightDepth = checkDepth(root.right, rightDepth);
        }
        return (Math.abs(leftDepth-rightDepth) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int checkDepth(TreeNode node, int depth) {
        int leftDepth = depth;
        int rightDepth = depth;
        if (node.left != null) {
            leftDepth++;
            leftDepth = checkDepth(node.left, leftDepth);
        }
        if (node.right != null) {
            rightDepth++;
            rightDepth = checkDepth(node.right, rightDepth);
        }

        return Math.max(leftDepth, rightDepth);
    }
}
/*
Given a binary tree, determine if it is
height-balanced
.

Input: root = [3,9,20,null,null,15,7]
Output: true

Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Input: root = []
Output: true

Constraints:
The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104
 */