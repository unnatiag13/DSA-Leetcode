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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(0,ans,root);
        return ans;
    }
    public void solve(int level,List<Integer> ans,TreeNode root){
        if(root==null) return;
        if(ans.size()<=level) ans.add(root.val);
        solve(level+1,ans,root.right);
        solve(level+1,ans,root.left);
    }
}