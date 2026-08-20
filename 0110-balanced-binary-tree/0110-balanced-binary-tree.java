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

class BalPair{
    boolean isBal = true;
    int ht =-1;
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        return Balanced(root).isBal;
    }
    public static BalPair Balanced(TreeNode root){
        if(root==null){
            return new BalPair();
        }
        BalPair lt = Balanced(root.left);
        BalPair rt = Balanced(root.right);
        boolean s = lt.isBal && rt.isBal && Math.abs(lt.ht-rt.ht)<=1;
        BalPair bp = new BalPair();
        bp.ht= Math.max(lt.ht,rt.ht)+1;
        bp.isBal =  s;
        return bp;
    }
}