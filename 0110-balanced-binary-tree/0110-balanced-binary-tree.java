/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // [1,2,2,3,null,null,3,4,null,null,4]
    public boolean isBalanced(TreeNode root) {
        return calculateHeight(root) !=-1;

    }
    public static int calculateHeight(TreeNode p){
        if(p==null) return 0;
        int left = calculateHeight(p.left);
        if(left==-1) return -1;
        int right = calculateHeight(p.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;

        return Math.max(left,right)+1;
    }
}