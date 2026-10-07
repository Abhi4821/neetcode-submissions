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
    static boolean ans;
    static void sum(TreeNode root,int s,int k){
        if(ans==true||root==null){
            return;
        }
        s=s+root.val;
        if(root.left==null&&root.right==null){
            if(s==k){
                ans=true;
            }
            return;
        }
        sum(root.left,s,k);
        sum(root.right,s,k);
        
    }
    public boolean hasPathSum(TreeNode root, int k) {
        ans=false;
        if(root==null){
            return ans;
        }
        sum(root,0,k);
        return ans;
    }
}