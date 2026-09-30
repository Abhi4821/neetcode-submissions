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
    static List<List<Integer>> list=new ArrayList<>();
    static void lot(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            while(size!=0){
                TreeNode f=q.poll();
                l.add(f.val);
                if(f.left!=null){
                    q.add(f.left);
                }
                if(f.right!=null){
                    q.add(f.right);
                }
                size--;
            }
            list.add(l);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList<>();
        lot(root);
        return list;

    }
}