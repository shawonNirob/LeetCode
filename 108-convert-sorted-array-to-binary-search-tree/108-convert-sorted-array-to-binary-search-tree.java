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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length-1);
    }
    private TreeNode bst(int[] nums, int left, int right){
        if(left>right) return null;
        
        int rootIndex = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[rootIndex]);
        
        root.left = bst(nums, left, rootIndex-1);
        root.right = bst(nums, rootIndex+1, right);
        
        return root;
    }
}