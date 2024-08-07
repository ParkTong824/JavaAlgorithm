package leetcode3;

public class S101_SymmetricTree {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.makeTreeNodeSample();

        System.out.println(isSymmetric(treeNode));
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        } else if (root.left != null && root.right != null) {
            return compareNode(root.left, root.right);
        } else {
            return false;
        }
    }

    private static boolean compareNode(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode.val != rightNode.val) {
            return false;
        }

        if (leftNode.left != null && rightNode.right != null) {
            if (!compareNode(leftNode.left, rightNode.right)) {
                return false;
            }
        }

        if (leftNode.right != null && rightNode.left != null) {
            if (!compareNode(leftNode.right, rightNode.left)) {
                return false;
            }
        }

        return (leftNode.left != null || rightNode.right == null) &&
                (leftNode.left == null || rightNode.right != null) &&
                (leftNode.right != null || rightNode.left == null) &&
                (leftNode.right == null || rightNode.left != null);
    }
}

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 */