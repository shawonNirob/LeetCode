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
    private int sum;
    private int n;
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        
        int left = averageOfSubtree(root.left);
        int right = averageOfSubtree(root.right);
        
        sum=0; n=0;
        helper(root);
        if(n != 0){
            if(sum/n == root.val){
              left++;
            }
        }
        return left+right;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        
        n++;
        sum += root.val;
        helper(root.left);
        helper(root.right);
    }
}