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
    public int goodNodes(TreeNode root) {
        return hlper(root,Integer.MIN_VALUE);
    }
    private int hlper (TreeNode root ,int currMax){
        if(root==null){
            return 0;
        }
        int rootans=0;
        if(root.val>=currMax){
            rootans=1;
            currMax=root.val;
        }
        int lans=hlper(root.left,currMax);
        int rans=hlper(root.right,currMax);
        return lans+rans+rootans;
    }
}
