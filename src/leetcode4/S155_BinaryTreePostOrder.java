package leetcode4;

import leetcode3.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S155_BinaryTreePostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();
        if (root == null) {
            return valueList;
        }

        if (root.left != null) {
            addValue(root.left, valueList);
        }

        if (root.right != null) {
            addValue(root.right, valueList);
        }
        valueList.add(root.val);

        return valueList;
    }

    public void addValue(TreeNode treeNode, List<Integer> valueList) {
        if (treeNode.left != null) {
            addValue(treeNode.left, valueList);
        }

        if (treeNode.right != null) {
            addValue(treeNode.right, valueList);
        }
        valueList.add(treeNode.val);
    }
}
