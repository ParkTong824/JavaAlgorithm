package leetcode3;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode makeTreeNodeSample() {
        //[1,2,2,3,null,null,3,4,null,null,4]
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(15);
        TreeNode treeNode6 = new TreeNode(7);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(4);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
//        treeNode1.left = treeNode3;
//        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
//        treeNode3.left = treeNode7;
//        treeNode3.right = treeNode8;

        return treeNode;
    }
}
