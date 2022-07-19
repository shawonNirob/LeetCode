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
    boolean sum = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        preOrder(root, 0, targetSum);
        if(sum) return true;
        return false;
    }
    public void preOrder(TreeNode root, int curr, int targetSum){
        if(root==null) return;
        curr = curr + root.val;
        if(root.left==null && root.right==null){
            if(curr == targetSum){
                sum = true;
            }
        }
        preOrder(root.left, curr, targetSum);
        preOrder(root.right, curr, targetSum);
    }
}