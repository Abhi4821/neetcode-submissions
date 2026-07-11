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
    public int hight(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=hight(root.left);
        int rh=hight(root.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=hight(root.left);
        int rh=hight(root.right);
        int rootDia=lh+rh;

        int leftDia=diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);
        return Math.max(Math.max(leftDia,rightDia),rootDia);
    }
}
