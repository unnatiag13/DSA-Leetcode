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
    public int rob(TreeNode root) {
        HashMap<TreeNode,Integer> map = new HashMap<>();
        return robber(root,map);
    }
    public int robber(TreeNode root,HashMap<TreeNode,Integer> map){
        if(root==null) return 0;
        if(map.containsKey(root)){
            return map.get(root);
        }
        int ans1 = root.val;
        if(root.left!=null){
            ans1 = ans1 + robber(root.left.left,map) + robber(root.left.right,map);
        }
        if(root.right!=null){
            ans1 =ans1 + robber(root.right.left,map) + robber(root.right.right,map);
        }
        int ans2 = robber(root.left,map) + robber(root.right,map);
        map.put(root,Math.max(ans1,ans2));
        return Math.max(ans1,ans2);
    }
}