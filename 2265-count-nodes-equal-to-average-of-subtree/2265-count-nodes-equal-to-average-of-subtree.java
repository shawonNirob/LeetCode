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
    public int averageOfSubtree(TreeNode root) {
        sum=0;
        helper(root);
        return sum;
    }
    public int[] helper(TreeNode root){
        if(root==null) return new int[] {0,0};

        int left[] = helper(root.left);
        int right[] = helper(root.right);
        
        int currSum = left[0]+right[0]+root.val;
        int currCount = left[1]+right[1]+1;
        
        if(currSum/currCount == root.val){
            sum++;
        }
            
        return new int[] {currSum, currCount};
    }
}