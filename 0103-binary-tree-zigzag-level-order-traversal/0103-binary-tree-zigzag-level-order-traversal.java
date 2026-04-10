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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return ans;
        queue.offer(root);
        Boolean ltr = true;
        while(!queue.isEmpty()){
            int n = queue.size();
            LinkedList<Integer> sublist = new LinkedList<>();

            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                if(ltr) sublist.addLast(node.val);
                else sublist.addFirst(node.val);

                if(node.left !=null)  queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            
            ans.add(sublist);
            ltr = !ltr;
        }
        return ans;

    }
}