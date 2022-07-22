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
    public boolean isUnivalTree(TreeNode root) {
        int res = root.val;
        TreeNode pre;
        while(root != null){
            if(root.left == null){
                if(root.val != res) return false;
                root=root.right;
            }else{
                pre = root.left;
                
                while(pre.right != null && pre.right != root){
                    pre=pre.right;
                }
                if(pre.right == root){
                    pre.right =null;
                    root = root.right;
                    
                }else{
                    if(root.val != res) return false;
                    pre.right = root;
                    root = root.left;
                }
            }
        }
        return true;
    }
}