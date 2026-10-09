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
    static List<Integer>list;
    static void isValid(TreeNode root){
        if(root==null){
            return ;
        }
        isValid(root.left);
        list.add(root.val);
        isValid(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        list=new ArrayList<>();
        isValid(root);
        int temp=list.get(0);
        for(int i=1;i<list.size();i++){
            if(temp<list.get(i)){
                temp=list.get(i);
            }else{
                return false;
            }
        }
        return true;  
    }
}