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
      public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
    static int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        helper(root);
        int ans = max;
        max=0;
        return ans;
        
    }
    public void  helper(TreeNode root){
        if(root==null) return ;
        max = Math.max(max,  maxDepth(root.left)+ maxDepth(root.right));
        helper(root.left);
        helper(root.right);
    }
}
