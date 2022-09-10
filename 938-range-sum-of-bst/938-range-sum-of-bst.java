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
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        helper(root, low, high);
        
        return sum;
    }
    public void helper(TreeNode root, int low, int high){
        if(root==null) return;
        //if(root.val < low) return;
        //if(root.val > high) return;
        
        if(root.val <= high && root.val >= low){
            sum += root.val;
        }
        helper(root.left, low, high);
        helper(root.right, low, high);
        
    }
}