
class Solution {
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int []inorder,int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);
        int i=0;
        while(rootValue!=inorder[i]){
            i++;
        }
        root.left = build(preorder, inorder, left, i - 1);
        root.right = build(preorder, inorder, i + 1, right);
        return root;
    }
}