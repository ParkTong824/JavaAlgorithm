package leetcode5;

import java.util.ArrayList;
import java.util.List;

public class S257_BinaryTreePaths {
    List<String> answerList = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        getPathString(root, null);

        return answerList;
    }

    private void getPathString(TreeNode node, String pathString) {
        String newPath;
        if (pathString == null) {
            newPath = String.valueOf(node.val);
        } else {
            newPath = pathString + "->" + node.val;
        }

        if (node.left != null) {
            getPathString(node.left, newPath);
        }
        if (node.right != null) {
            getPathString(node.right, newPath);
        }

        if (node.left == null && node.right == null) {
            answerList.add(newPath);
        }
    }
}

/*
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.



Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]

 */