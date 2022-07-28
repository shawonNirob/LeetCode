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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        preorder(root);
        return root;
    }
    public void preorder(TreeNode root){
        if(root==null) return;
        
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
        
        if(root.left!=null) preorder(root.left);
        if(root.right!=null) preorder(root.right);
    }
}