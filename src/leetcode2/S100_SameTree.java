package leetcode2;

public class S100_SameTree {

    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        return compare(p, q);
    }

    private boolean compare(TreeNode p, TreeNode q) {
        if ( (p != null && q == null) || (p == null && q != null) ) {
            return false;
        }
        if (
                (p.left == null && q.left != null) ||
                (p.left != null && q.left == null) ||
                (p.right == null && q.right != null) ||
                (p.right != null && q.right == null)
        ) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        if (p.left != null && q.left != null) {
            if(!compare(p.left, q.left)) {
                return false;
            }
        }

        if (p.right != null && q.right != null) {
            if(!compare(p.right, q.right)) {
                return false;
            }
        }

        return true;
    }


    public class TreeNode {
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
}

/*

 */