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
    public int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        if(root.left !=null) diameterOfBinaryTree(root.left);
        if(root.right != null) diameterOfBinaryTree(root.right);
        
        return diameter;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}