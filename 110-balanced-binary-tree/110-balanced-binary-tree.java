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
    private boolean ans;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        ans = true;
        heightBalanced(root);
        if(ans) return true;
        
        return false;
    }
    public int heightBalanced(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = heightBalanced(root.left);
        int rightHeight = heightBalanced(root.right);
        
        int heightDiff = Math.abs(leftHeight - rightHeight);
        if(heightDiff > 1) ans = false;
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}