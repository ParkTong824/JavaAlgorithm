package leetcode6;

public class S543_DiameterOfBinaryTree {
    int diameter = 0;
    public int dfs(TreeNode node) {
        if(node == null)
            return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        dfs(root);

        return diameter;
    }
}
/*
                4,
    -7,              -3,
null,null,      -9,           -3,
        9,         -7,     -4,     null,
    6,  null   ,-6,   -6,
  0  ,6,     5,     ,9,null,
null,-1,-4,      ,null,-2
Given the root of a binary tree, return the length of the diameter of the tree.
-7 4

4 -3
[4,
                                                    -3,
                             -9,                                        -3,
                9,                    -7,                     -4,                 null,
            6,                 -6,          -6,             null,null,
       0,       6,         5,             9,null,
  null,  -1,  -4, null,null,null       ,-2
9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.



Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1
 */
