package leetcode3;

import java.util.ArrayList;
import java.util.List;

public class S144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();
        if (root == null) {
            return valueList;
        }
        valueList.add(root.val);

        if (root.left != null) {
            addValue(root.left, valueList);
        }

        if (root.right != null) {
            addValue(root.right, valueList);
        }

        return valueList;
    }

    public void addValue(TreeNode treeNode, List<Integer> valueList) {
        valueList.add(treeNode.val);
        if (treeNode.left != null) {
            addValue(treeNode.left, valueList);
        }

        if (treeNode.right != null) {
            addValue(treeNode.right, valueList);
        }
    }
}

/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Input: root = [1,null,2,3]
Output: [1,2,3]

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [1,2,4,5,6,7,3,8,9]

Input: root = []
Output: []

Input: root = [1]
Output: [1]


 */