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
    private int value;
    private int index;
    public int kthSmallest(TreeNode root, int k) {
        index = 1;
        inorder(root, k);
        return value;
    }
    private void inorder(TreeNode root, int k){
        if(root==null) return;
        inorder(root.left, k);
        if(index==k){
            value = root.val;
        }
        index = index+1;
        inorder(root.right, k);
    }
}