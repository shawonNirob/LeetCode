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
    private int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        maxHeight(root);
        return max;
    }
    private int maxHeight(TreeNode root){
        if(root==null) return 0;
        
        int left = Math.max(maxHeight(root.left), 0);
        int right = Math.max(maxHeight(root.right),0);
        
        max = Math.max(max, root.val+left+right);
        return Math.max(root.val+left, root.val+right);
    }
}