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

class Pair{
    int moves =0;
    int reruirement =0;
}
class Solution {
    int ans =0;
    public int distributeCoins(TreeNode root) {
        distribute(root);
        return ans;
    }
    public int distribute(TreeNode root) {
        if(root==null) return 0;
        int lp = distribute(root.left);
        int rp = distribute(root.right);

        ans += Math.abs(lp) + Math.abs(rp);
        return lp+rp + root.val-1;

    }
}

