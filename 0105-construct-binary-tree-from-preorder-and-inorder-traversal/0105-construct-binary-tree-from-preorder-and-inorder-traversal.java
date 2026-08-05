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
    private int preindex;
    private Map<Integer,Integer> map=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preindex=0;

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return helper(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder,int[] inorder,int left,int right){
        if(left>right){
            return null;
        }

        int root=preorder[preindex++];
        TreeNode node=new TreeNode(root);

        int inorderindex=map.get(root);

        node.left=helper(preorder,inorder,left,inorderindex-1);
        node.right=helper(preorder,inorder,inorderindex+1,right);

        return node;
    }
}