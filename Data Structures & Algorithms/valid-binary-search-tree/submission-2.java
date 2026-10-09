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
    static long pre;
    static boolean ans;

    //Without extra space
    static void isValid(TreeNode root){
        if(root==null||ans==false){
            return ;
        }
        isValid(root.left);
        if(pre>=root.val){
            ans=false;
        }else{
            pre=root.val;
        }
        isValid(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        pre=Long.MIN_VALUE;
        ans=true;
        isValid(root);
        return ans;  
    }
}