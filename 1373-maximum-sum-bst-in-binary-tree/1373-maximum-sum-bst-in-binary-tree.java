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
class BSTPair{
    boolean isBST = true;
    Long max = Long.MIN_VALUE;
    Long min = Long.MAX_VALUE;
    int sum =0;
    int ans =0;
}
class Solution {
    public int maxSumBST(TreeNode root) {
        return ValidBST(root).ans;
    }
    public BSTPair ValidBST(TreeNode root){
        if(root==null) return new BSTPair();
        BSTPair lbp = ValidBST(root.left);
        BSTPair rbp = ValidBST(root.right);
        BSTPair sbp =new BSTPair();
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.sum = lbp.sum +rbp.sum+root.val;

        if(lbp.isBST &&rbp.isBST && lbp.max<root.val && rbp.min>root.val){
            sbp.isBST =true;
            sbp.ans = Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
        }else{
            sbp.isBST = false;
            sbp.ans = Math.max(lbp.ans,rbp.ans);
        }
        return sbp;
    }
}