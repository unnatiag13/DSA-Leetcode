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
    int cnt =0;

    public int minCameraCover(TreeNode root) {
        // 0 - already covered
        // 1 - has camera
        // -1 - need camera
        int x = camera(root);
        if(x==-1) cnt++;
        return cnt;
    }
    public int camera(TreeNode root){
        if(root==null) return 0;
        int lp = camera(root.left);
        int rp = camera(root.right);
        if(Math.min(lp,rp)==-1){ 
            cnt++;
            return 1;
        }
        else if(lp==1 || rp==1) return 0;
        // else if(lp==0 && rp==0) return -1;
        else return -1;
    }
}