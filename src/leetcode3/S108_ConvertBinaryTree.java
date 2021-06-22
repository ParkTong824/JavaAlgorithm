package leetcode3;

public class S108_ConvertBinaryTree {
    public TreeNode convert(int[] nums,int left,int right){
        // important base case
        if(left>right) return null;
        //finding mid value
        int mid=(left+right)/2;
        //creating Node for mid element
        TreeNode temp=new TreeNode(nums[mid]);
        //recursively calling for its left and right elements
        temp.left=convert(nums,left,mid-1);
        temp.right=convert(nums,mid+1,right);
        return temp;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0,nums.length-1);
    }
}
class TreeNode {
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