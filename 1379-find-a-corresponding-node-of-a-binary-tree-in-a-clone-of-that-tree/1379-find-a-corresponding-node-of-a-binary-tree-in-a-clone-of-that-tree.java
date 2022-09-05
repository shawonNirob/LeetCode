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
        helper(cloned, target);
        return ans;
    }
    public void helper(TreeNode root, TreeNode target){
        if(root.val == target.val) ans = root;
        
        if(root.left != null) helper(root.left, target);
        if(root.right != null) helper(root.right, target);
    }
}