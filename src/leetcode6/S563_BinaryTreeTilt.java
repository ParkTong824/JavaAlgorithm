package leetcode6;

public class S563_BinaryTreeTilt {

    public int findTilt(TreeNode root) {
        int sum = 0;
        if (root == null) return 0;

        return sumDiff(root, sum);
    }
    private int sumDiff(TreeNode node, int sum) {
        int leftValue = 0;
        if (node.left != null){
            leftValue = sumAllChildren(node.left, node.left.val);
        }
        int rightValue = 0;
        if (node.right != null){
            rightValue = sumAllChildren(node.right, node.right.val);
        }
        sum += Math.abs(leftValue - rightValue);

        if (node.left != null) {
            sum = sumDiff(node.left, sum);
        }
        if (node.right != null) {
            sum = sumDiff(node.right, sum);
        }

        return sum;
    }

    private int sumAllChildren(TreeNode node, int sum) {
        if (node.left != null) {
            sum += node.left.val;
            sum = sumAllChildren(node.left, sum);
        }
        if (node.right != null) {
            sum += node.right.val;
            sum = sumAllChildren(node.right, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(9);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(5);
//        TreeNode left2 = new TreeNode(6);
        TreeNode right2 = new TreeNode(7);
        root.left = left;
        root.right = right;
        left.left = left1;
        left.right = right1;
        right.right = right2;
        System.out.println(new S563_BinaryTreeTilt().findTilt(root));
    }
}
/*
Given the root of a binary tree, return the sum of every tree node's tilt.

The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values. If a node does not have a left child, then the sum of the left subtree node values is treated as 0. The rule is similar if the node does not have a right child.



Example 1:


Input: root = [1,2,3]
Output: 1
Explanation:
Tilt of node 2 : |0-0| = 0 (no children)
Tilt of node 3 : |0-0| = 0 (no children)
Tilt of node 1 : |2-3| = 1 (left subtree is just left child, so sum is 2; right subtree is just right child, so sum is 3)
Sum of every tilt : 0 + 0 + 1 = 1
Example 2:


Input: root = [4,2,9,3,5,null,7]
Output: 15
Explanation:
Tilt of node 3 : |0-0| = 0 (no children)
Tilt of node 5 : |0-0| = 0 (no children)
Tilt of node 7 : |0-0| = 0 (no children)
Tilt of node 2 : |3-5| = 2 (left subtree is just left child, so sum is 3; right subtree is just right child, so sum is 5)
Tilt of node 9 : |0-7| = 7 (no left child, so sum is 0; right subtree is just right child, so sum is 7)
Tilt of node 4 : |(3+5+2)-(9+7)| = |10-16| = 6 (left subtree values are 3, 5, and 2, which sums to 10; right subtree values are 9 and 7, which sums to 16)
Sum of every tilt : 0 + 0 + 0 + 2 + 7 + 6 = 15
Example 3:


Input: root = [21,7,14,1,1,2,2,3,3]
Output: 9
 */