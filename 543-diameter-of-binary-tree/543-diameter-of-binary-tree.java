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
    public int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter =0 ;
        diaBST(root);
        return diameter;
    }
    public int diaBST(TreeNode root){
        if(root == null) return 0;
        
        int leftHeight = diaBST(root.left);
        int rightHeight = diaBST(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        return Math.max(leftHeight, rightHeight)+1;
    }
}