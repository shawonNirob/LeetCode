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
                
                while(pre.right != null){
                    pre=pre.right;
                }
                pre.right = root;
                
                TreeNode curr = root.left;
                root.left = null;
                root = curr;
            }
        }
        return true;
    }
}