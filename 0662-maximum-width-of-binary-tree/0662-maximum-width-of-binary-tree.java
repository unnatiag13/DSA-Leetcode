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
    TreeNode node;
    int n;
    Pair(TreeNode node,int n){
        this.node = node;
        this.n=n;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q  = new LinkedList<>();
        int idx =0;
        q.offer(new Pair(root,idx));
        int width =0;
        while(!q.isEmpty()){
            Pair start = q.peek();
            int s = q.size();
            Pair end = start;
            for(int i=0;i<s;i++){
                Pair r = q.poll();
                end =r;
                if(r.node.left!=null){
                    q.add(new Pair(r.node.left,2*r.n+1));
                }
                if(r.node.right!=null){
                    q.add(new Pair(r.node.right,2*r.n+2));
                }
            }
            width = Math.max(width,end.n-start.n+1);
        }
        return width;
    }
}