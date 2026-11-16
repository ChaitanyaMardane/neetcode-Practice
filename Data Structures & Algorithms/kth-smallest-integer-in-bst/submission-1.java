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
    public int kthSmallest(TreeNode root, int k) {
        int[]  i = new int[]{0,-1};
        return helper(  root , i,k);
    }
    public int helper( TreeNode root , int[] id,int k){
        if(root==null) return -1;
        int left = helper(root.left, id, k);
        if( left!=-1) return left;
         id[0]=id[0]+1;
         if(id[0]==k) return id[1]=root.val;
        int right =helper(root.right, id, k);
        if(right!=-1) return right;
        return -1;
    }
}
