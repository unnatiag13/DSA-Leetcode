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
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return ValidBST(root).isBST;

    }
    public BSTPair ValidBST(TreeNode root){
        if(root==null) return new BSTPair();
        BSTPair lbp = ValidBST(root.left);
        BSTPair rbp = ValidBST(root.right);
        BSTPair sbp =new BSTPair();
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));

        if(lbp.isBST &&rbp.isBST && lbp.max<root.val && rbp.min>root.val){
            sbp.isBST =true;
        }else{
            sbp.isBST = false;
        }
        return sbp;
    }
}