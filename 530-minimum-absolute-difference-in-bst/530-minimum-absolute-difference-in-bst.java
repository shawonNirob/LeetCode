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
    private int min = 10001;
    public int getMinimumDifference(TreeNode root) {
        if(root.left != null) helper(root.left, root.val);
        if(root.right != null) helper(root.right, root.val);
        
        if(root.left != null) getMinimumDifference(root.left);
        if(root.right != null) getMinimumDifference(root.right);
        return min;
    }
    private void helper(TreeNode root, int val){
        min = Math.min(min, Math.abs(root.val - val));
        if(root.left != null) helper(root.left, val);
        if(root.right != null) helper(root.right, val);
    }
}