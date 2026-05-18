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
 * }s
 */
class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
    
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode val = q.poll();
                if(val.left!=null) q.offer(val.left);
                if(val.right!=null) q.offer(val.right);
                sublist.add(val.val);
            }
            ans.add(sublist);
        }
        return ans;

    }
}