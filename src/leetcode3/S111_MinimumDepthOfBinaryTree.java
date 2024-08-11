package leetcode3;

public class S111_MinimumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
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

        return leftDepth == 0 || rightDepth == 0 ? Math.max(leftDepth, rightDepth)+1 : Math.min(leftDepth, rightDepth)+1;
    }

    public int checkDepth(TreeNode node, int depth) {
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

        return leftDepth == depth || rightDepth == depth ? Math.max(leftDepth, rightDepth) : Math.min(leftDepth, rightDepth);
    }
}
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Input: root = [3,9,20,null,null,15,7]
Output: 2

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 */