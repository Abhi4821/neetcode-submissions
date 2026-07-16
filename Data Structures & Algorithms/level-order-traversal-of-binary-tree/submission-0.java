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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
            ans.clear();
            if(root==null){
                return ans;
            }
            ArrayList<Integer>temp=new ArrayList<>();
            Queue<TreeNode>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                TreeNode currNode=q.remove();
                if(currNode==null){
                    ans.add(temp);
                    temp=new ArrayList<>();
                     if(q.isEmpty()){
                        break;
                     }else{
                        q.add(null);
                     }
                }else{
                    temp.add(currNode.val);
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                } 
            }
            return ans;
    
    }
}
