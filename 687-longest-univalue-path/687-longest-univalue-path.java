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
class Solution{
    private int path =0 ;
    public int longestUnivaluePath(TreeNode root){
        if(root==null) return 0;
        length(root, root.val);
        return path;
    }
    public int length(TreeNode root, int val){
        if(root==null) return 0;
        int left = length(root.left, root.val);
        int right = length(root.right, root.val);
        path = Math.max(path, left+right);
        if(val == root.val) return Math.max(left, right) + 1;
        return 0;
    } 
}