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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int heightDiff = Math.abs(leftHeight -  rightHeight);
        
        return heightDiff < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) +1;
    }
}