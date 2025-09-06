// 145 : Binary Tree Postorder Traversal

import java.util.ArrayList;
import java.util.List;

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    public static void postorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorder(root.left, list);  
        postorder(root.right, list);  
        list.add(root.val);           
    }
}

// // This code performs a postorder traversal of a binary tree and returns the values of the nodes in a list.