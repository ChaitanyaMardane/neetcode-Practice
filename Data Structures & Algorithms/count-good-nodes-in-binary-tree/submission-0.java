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
    public int goodNodes(TreeNode root) {
        
        return helper( root, root.val, new int[]{0});
        
    }
    public int helper( TreeNode root , int max , int[] cnt) {
        if(root==null) return cnt[0];
        if(root.val>=max){
            max=root.val;
            cnt[0]++;
        }
        helper(root.left, max , cnt);
        helper(root.right, max , cnt);
        return cnt[0];
    }
}
