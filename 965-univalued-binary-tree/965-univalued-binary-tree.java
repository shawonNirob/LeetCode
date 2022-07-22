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
    public boolean res=true;
    
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        preorder(root, val);
        if(res){
            return true;
        }
        return false;
    }
    
    public void preorder(TreeNode root, int val){
        if(root == null) return;
        
        if(root.val != val) res = false;
        
        if(root.left != null) preorder(root.left, val);
        if(root.right != null) preorder(root.right, val);
    }
}