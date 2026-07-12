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
    boolean blance_factor=true;
    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
        if(Math.abs(lh-rh)>1){
           blance_factor=false;
        }
        return Math.max(lh,rh)+1; 
    }
    public boolean isBalanced(TreeNode root) {
       int h=Height(root);
       return blance_factor;
    }
}
