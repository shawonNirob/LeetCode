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
    public TreeNode curr;
    public TreeNode increasingBST(TreeNode root){
        TreeNode node = new TreeNode(-1);
        curr = node;
        helper(root);
        return node.right;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        
        root.left = null;
        curr.right = root;
        curr = curr.right;
        
        helper(root.right);
    }
}