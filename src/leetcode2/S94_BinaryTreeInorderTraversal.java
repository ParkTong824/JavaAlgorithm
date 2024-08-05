package leetcode2;

import java.util.ArrayList;
import java.util.List;

public class S94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root != null) {
            addList(root, answer);
        }

        return answer;
    }

    private void addList(TreeNode node, List<Integer> answer) {
        if (node.left != null) {
            addList(node.left, answer);
        }
        answer.add(node.val);
        if (node.right != null) {
            addList(node.right, answer);
        }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {

            this.val = val;

            this.left = left;

            this.right = right;

        }
    }
}
/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Input: root = [1,null,2,3]
Output: [1,3,2]

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,2,6,5,7,1,3,9,8]

Input: root = []
Output: []

Input: root = [1]
Output: [1]



Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */