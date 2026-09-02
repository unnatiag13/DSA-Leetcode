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
    public void inorder(TreeNode root,List<TreeNode> li){
        if(root==null) return;
        inorder(root.left,li);
        li.add(root);
        inorder(root.right,li);
    }
    public void recoverTree(TreeNode root) {
        List<TreeNode> ll = new ArrayList<>();
        inorder(root,ll);
        TreeNode first = null;
        TreeNode second = null;

        for(int i=0;i<ll.size()-1;i++){
            if(ll.get(i).val>ll.get(i+1).val){
                first = ll.get(i);
                break;
            }
        }
        for(int i=ll.size()-1;i>0;i--){
            if(ll.get(i).val<ll.get(i-1).val){
                second = ll.get(i);
                break;
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val= temp;
    }
}