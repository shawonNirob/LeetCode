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
    private int firstMin;
    private long secondMin;
    public int findSecondMinimumValue(TreeNode root) {
        firstMin = root.val;
        secondMin = Long.MAX_VALUE;
        preorder(root);
        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }
    private void preorder(TreeNode root){
        if(root==null) return;
        if(root.val > firstMin && root.val < secondMin){
            secondMin = root.val;
        }
        preorder(root.left);
        preorder(root.right);
    }
}