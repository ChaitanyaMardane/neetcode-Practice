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
  
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return  new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(root , ans , 0);
        return ans ;
        
    }
    // public void helper(TreeNode root, List<Integer> ans  , int level  ){
    //     if(root == null) return;
    //    if (level == ans.size()) {
    //     ans.add(root.val);
    //     }
    //      helper(root.right, ans , level+1);
    //      helper(root.left, ans , level+1);

    // }
     public void helper(TreeNode root, List<Integer> ans  , int level  ){
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       int cnt =0;
       while (!q.isEmpty()) {
        int size = q.size();   // number of nodes in this level
        TreeNode node = null;

        for (int i = 0; i < size; i++) {
            node = q.poll();

            if (node.left != null)  q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

        // node is the last popped node of this level → rightmost
        ans.add(node.val);
    }
    }
}
