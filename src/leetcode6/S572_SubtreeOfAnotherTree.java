package leetcode6;

public class S572_SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return recursiveSearch(root, subRoot);
    }

    private boolean recursiveSearch(TreeNode root, TreeNode subRoot) {
        if (compareTree(root, subRoot)) {
            return true;
        } else {
            boolean leftRecursive = false;
            boolean rightRecursive = false;
            if (root.left != null) {
                leftRecursive = recursiveSearch(root.left, subRoot);
            }
            if (root.right != null) {
                rightRecursive = recursiveSearch(root.right, subRoot);
            }
            return leftRecursive || rightRecursive;
        }
    }

    private boolean compareTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        try {
            if (node1.val == node2.val) {
                boolean leftSame = compareTree(node1.left, node2.left);
                boolean rightSame = compareTree(node1.right, node2.right);

                return leftSame && rightSame;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }
}
/*
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.



Example 1:


Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
Example 2:


Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false


Constraints:

The number of nodes in the root tree is in the range [1, 2000].
The number of nodes in the subRoot tree is in the range [1, 1000].
-104 <= root.val <= 104
-104 <= subRoot.val <= 104
 */