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
    public int depth(int[] dia,TreeNode root){
        if(root==null) return 0;

        int left =  depth(dia,root.left);
        int right = depth(dia,root.right);

        dia[0]= Math.max(dia[0],left+right);

        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
       int[] dia = new int[1];
       depth(dia,root);
       return dia[0];
    }
}