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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructBT(nums, 0, nums.length-1);
    }
    private TreeNode constructBT(int[] nums, int left, int right){
        if(left>right) return null;
        int maxIndex = findMax(nums,left,right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = constructBT(nums, left, maxIndex-1);
        root.right = constructBT(nums, maxIndex+1, right);
        return root;
    }
    private int findMax(int[] nums, int left, int right){
        int max = left ; 
        for(int i=left; i<=right; i++){
            if(nums[i] > nums[max]){
                max = i;
            } 
        }
        return max;
    }
}