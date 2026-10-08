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
    static void check(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode f = q.poll();
            if(f==null){
                while(!q.isEmpty()){
                    f=q.poll();
                    if(f!=null){
                        ans=false;
                    } 
                }
                return;
            }
            q.add(f.left);
            q.add(f.right);
        }
    }
    public boolean isCompleteTree(TreeNode root) {
        ans=true;
        check(root);
        return ans;

    }
}