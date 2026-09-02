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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
        
    }
    public TreeNode createTree(int[] pre, int[] in,int ilo,int ihi,int plo,int phi) {
        if(plo>phi || ilo>ihi) return null;
        TreeNode root = new TreeNode(pre[plo]);
        int idx = search(in,ilo,ihi,pre[plo]);
        int lc = idx-ilo;
        root.left = createTree(pre,in,ilo,idx-1,plo+1,plo+lc);
        root.right = createTree(pre,in,idx+1,ihi,plo+lc+1,phi);
        return root;
    }
    private int search(int[] in,int si,int ei,int item){
        for(int i=si;i<=ei;i++){
            if(in[i]==item) return i;
        }
        return 0;
    }
}