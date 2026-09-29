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
    static List <Integer>list=new ArrayList<>();
    static void Preorder(TreeNode root){
        if(root==null){
            return ;
        }
        list.add(root.val);
        Preorder(root.left);
        
        Preorder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        list.clear();  
        Preorder(root);
        return list;
        
    }
}