package leetcode5;

public class S222_CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.makeTreeNode();
        System.out.println(countNodes(treeNode));
    }
    private static int depth = 0;
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode temp = root;
        depth = countTreeDepth(temp);
        if (depth == 0) {
            return 1;
        }
        int leafCount = checkLeafNode(root, 0);
        int answer = 0;
        for (int i = 0 ; i <= depth ; i++) {
            answer += (int) (Math.pow(2, depth-1-i));
        }
        return answer + leafCount;
    }

    private static int countTreeDepth(TreeNode node) {
        int count = 0;
        while (node != null) {
            if (node.left != null) {
                node = node.left;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private static int checkLeafNode(TreeNode node, int count) {
        int answer = 0;
        if (count == depth-1) {
            if (node.left != null) {
                answer++;
                if (node.right != null) {
                    answer++;
                }
            }
        } else {
            count++;
            if (node.left != null) {
                answer += checkLeafNode(node.left, count);
                if (node.right != null) {
                    answer += checkLeafNode(node.right, count);
                }
            }
        }
        return answer;
    }
}
/*
Given the root of a complete binary tree, return the number of the nodes in the tree.

According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
and all nodes in the last level are as far left as possible.
It can have between 1 and 2h nodes inclusive at the last level h.

Design an algorithm that runs in less than O(n) time complexity.



Example 1:


Input: root = [1,2,3,4,5,6]
Output: 6
Example 2:

Input: root = []
Output: 0
Example 3:

Input: root = [1]
Output: 1


Constraints:

The number of nodes in the tree is in the range [0, 5 * 104].
0 <= Node.val <= 5 * 104
The tree is guaranteed to be complete.
 */
