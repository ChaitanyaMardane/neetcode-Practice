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
    public int maxNode(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
      return  Math.max(root.val , Math.max(maxNode(root.left),maxNode(root.right)));
    }
     public int minNode(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
      return  Math.min(root.val , Math.min(minNode(root.left),minNode(root.right)));
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        int leftMax = maxNode(root.left);
        int rightMin = minNode(root.right);

        if (root.left != null && leftMax >= root.val) return false;
        if (root.right != null && rightMin <= root.val) return false;
        
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
