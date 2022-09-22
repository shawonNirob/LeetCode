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
    private int max = 0;
    private TreeNode node;
    public TreeNode subtreeWithAllDeepest(TreeNode root){
        helper(root, 0);
        return node;
    }
    public int helper(TreeNode root, int level){
        if(root==null) return level-1;
        
        int left = helper(root.left, level+1);
        int right = helper(root.right, level+1);
        
        if(left==right){
            max = Math.max(max, left);
            if(max==left){
                node=root;
            }
        }
        
        return Math.max(left, right);
    }
}