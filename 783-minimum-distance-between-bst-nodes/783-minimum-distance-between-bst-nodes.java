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
    private int min;
    private TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        min = Integer.MAX_VALUE;
        inorder(root);
        return min;
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        if(prev != null ) min = Math.min(min, Math.abs(root.val - prev.val));
        prev = root;
        inorder(root.right);
    }
}