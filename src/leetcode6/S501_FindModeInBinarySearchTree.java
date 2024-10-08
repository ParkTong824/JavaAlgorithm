package leetcode6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S501_FindModeInBinarySearchTree {
    Map<Integer, Integer> countMap = new HashMap<>();
    int modeCount = 0;

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];

        countMap.put(root.val, 1);
        modeCount++;
        checkNumber(root);
        List<Integer> list = new ArrayList<>();
        for (int key : countMap.keySet()) {
            if (countMap.get(key) == modeCount) {
                list.add(key);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    private void checkNumber(TreeNode node){
        if (node.left != null) {
            countMap.put(node.left.val, countMap.getOrDefault(node.left.val, 0) + 1);
            if (countMap.get(node.left.val) > modeCount) {
                modeCount = countMap.get(node.left.val);
            }
            checkNumber(node.left);
        }

        if (node.right != null) {
            countMap.put(node.right.val, countMap.getOrDefault(node.right.val, 0) + 1);
            if (countMap.get(node.right.val) > modeCount) {
                modeCount = countMap.get(node.right.val);
            }
            checkNumber(node.right);
        }
    }
}

/*
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [1,null,2,2]
Output: [2]
Example 2:

Input: root = [0]
Output: [0]

 */