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
    public int height(TreeNode root){
        if(root == null ) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int h = height(root);
        while(h>0){
            ans.add(new ArrayList<>());
            h--; 
        }

        helper(root , ans , 0);
        return ans ;
        
    }
    public void helper(TreeNode root, List<List<Integer>> ans  , int level  ){
        if(root == null) return;
        ans.get(level).add(root.val);
         helper(root.left, ans , level+1);
         helper(root.right, ans , level+1);

    }
}
