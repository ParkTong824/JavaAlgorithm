package leetcode6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S530_MinimumAbsoluteDifferenceInBST {
    List<Integer> treeValue = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int minDiff = Integer.MAX_VALUE;
        setTreeValue(root);
        Collections.sort(treeValue);
        for (int i = 1; i < treeValue.size(); i++) {
            if (treeValue.get(i)-treeValue.get(i-1) < minDiff) {
                minDiff = treeValue.get(i)-treeValue.get(i-1);
            }
        }
        return minDiff;
    }

    public void setTreeValue(TreeNode node) {
        treeValue.add(node.val);
        if (node.left != null) {
            setTreeValue(node.left);
        }
        if (node.right != null) {
            setTreeValue(node.right);
        }
    }
}
/*
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.



Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1


Constraints:

The number of nodes in the tree is in the range [2, 104].
0 <= Node.val <= 105
 */