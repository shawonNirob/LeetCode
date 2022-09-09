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
    private int path;
    public int longestUnivaluePath(TreeNode root) {
        path = 0;
        helper(root);
        
        return path;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int leftVar=0, rightVar=0;
        if(root.left != null && root.left.val == root.val){
            leftVar += left;
        }
        if(root.right != null && root.right.val == root.val){
            rightVar += right;
        }
        
        path = Math.max(path, leftVar+rightVar);
        return Math.max(leftVar, rightVar) +1;
    }
}