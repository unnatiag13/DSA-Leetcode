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
    // left tail ke right me right ka head join
    // root ke right me left ka head add 
    // root ka left null
    // if left ka tail null h toh rigth ka tail return 
    public void flatten(TreeNode root) {
        makeLL(root);
    }
    public TreeNode makeLL(TreeNode root){
        if(root==null) return null;
        if(root.left==null &root.right ==null) return root;
        TreeNode left_tail =  makeLL(root.left);
        TreeNode right_tail =  makeLL(root.right);
        if(left_tail!=null) {
            left_tail.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return right_tail!=null? right_tail:left_tail;
    } 
}