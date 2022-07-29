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
    public int result = 0;
    
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return result;
    }
    public int helper(TreeNode root){
        int left = (root.left != null) ? helper(root.left) : 0;
        int right = (root.right != null) ? helper(root.right) : 0;
        result += Math.abs(left - right);
        return left+right+root.val;
    }
}