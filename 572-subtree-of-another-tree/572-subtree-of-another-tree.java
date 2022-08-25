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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(check(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean check(TreeNode root, TreeNode subRoot){
        if(subRoot==null && root==null) return true;
        if(root==null || subRoot==null) return false;
        if(root.val == subRoot.val){
            return check(root.left, subRoot.left) && check(root.right, subRoot.right);
        }else{
            return false;
        }
    }
}