/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(original, cloned, target);
        return ans;
    }
    public void helper(TreeNode original, TreeNode root, TreeNode target){
        if(original == target) ans = root;
        
        if(original.left != null) helper(original.left, root.left, target);
        if(original.right != null) helper(original.right, root.right, target);
    }
}