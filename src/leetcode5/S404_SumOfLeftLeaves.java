package leetcode5;

public class S404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumNodeValue(root, 0);
    }

    private int sumNodeValue(TreeNode node, int sum) {
        if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
                sum+=node.left.val;
            } else {
                sum = sumNodeValue(node.left, sum);
            }
        }
        if (node.right != null) {
            sum = sumNodeValue(node.right, sum);
        }

        return sum;
    }
}
/*
root =
[0,2,4,1,null,3,-1,5,1,null,6,null,8]

Use Testcase
Output
8
Expected
5


Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:

Input: root = [1]
Output: 0


Constraints:

The number of nodes in the tree is in the range [1, 1000].
-1000 <= Node.val <= 1000
 */
