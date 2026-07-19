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
    int count=0;
    int max=Integer.MIN_VALUE;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    int dfs(TreeNode root){
        if(root==null) return 0;

        int left=dfs(root.left);
        int right=dfs(root.right);

        if(root.val>=left && root.val>=right){
            count++;
        }
        return Math.max(Math.max(left,right),root.val);
    }
}