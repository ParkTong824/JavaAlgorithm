package leetcode3;

public class S104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.makeTreeNodeSample();

        int answer = maxDepth(treeNode);
    }
    public static int maxDepth(TreeNode root) {
        if (root != null) {
            return checkNodeDepth(root, 1);
        }
        return 0;
    }

    public static int checkNodeDepth(TreeNode node, int depth) {
        int leftDepth = depth;
        int rightDepth = depth;
        if (node.left != null) {
            leftDepth++;
            leftDepth = Math.max(depth, checkNodeDepth(node.left, leftDepth));
        }

        if (node.right != null) {
            rightDepth++;
            rightDepth = Math.max(depth, checkNodeDepth(node.right, rightDepth));
        }

        return Math.max(leftDepth, rightDepth);
    }
}
/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
 */

