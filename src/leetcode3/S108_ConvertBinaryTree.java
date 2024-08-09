package leetcode3;

public class S108_ConvertBinaryTree {
    public static void main(String[] args) {
        int[] nums = {-10, -3,0,5,9};

        sortedArrayToBST(nums);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(nums[nums.length/2]);

        if (nums.length > 1) {
            addChildNode(nums, root, nums.length/2, 0, nums.length-1);
        }

        return root;
    }

    public static void addChildNode(int[] nums, TreeNode parentsNode, int parentsIndex, int startIndex, int lastIndex) {
        if (startIndex < parentsIndex) {
            int firstIndex = (parentsIndex-1 - startIndex)/2 + startIndex;
            TreeNode firstNode = new TreeNode(nums[firstIndex]);
            if (firstNode.val < parentsNode.val) {
                parentsNode.left = firstNode;
            } else {
                parentsNode.right = firstNode;
            }
            if (firstIndex < parentsIndex-1) {
                addChildNode(nums, firstNode, firstIndex, startIndex, parentsIndex-1);
            }
        }
        if (parentsIndex < lastIndex) {
            int secondIndex = lastIndex - (lastIndex - (parentsIndex+1))/2;
            TreeNode secondNode = new TreeNode(nums[secondIndex]);
            if (secondNode.val < parentsNode.val) {
                parentsNode.left = secondNode;
            } else {
                parentsNode.right = secondNode;
            }
            if (secondIndex <= lastIndex) {
                addChildNode(nums, secondNode, secondIndex,parentsIndex+1, lastIndex);
            }
        }
    }
}
/*
[0,-10,9,null,null,5]
Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
 binary search tree.

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 */
