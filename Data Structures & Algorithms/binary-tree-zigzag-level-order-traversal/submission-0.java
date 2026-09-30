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
        int z=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i = 0; i < size; i++){
               l.add(0);
            }
            z++;
            int first=0;
            int last=size-1;
            while(size!=0){
                TreeNode f=q.poll();
                if(z%2==0){
                    l.set(last,f.val);
                    last--;
                }else{
                    l.set(first,f.val);
                    first++;
                }
                
                
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        list = new ArrayList<>();
        lot(root);
        return list;
    }
}