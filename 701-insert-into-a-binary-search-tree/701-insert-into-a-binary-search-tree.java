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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        while(root != null){
            if(val > root.val){
                if(root.right != null){
                    root = root.right;
                }else{
                    root.right = new TreeNode(val);
                    return node;
                }
            }else{
                if(root.left != null){
                    root = root.left;
                }else{
                    root.left = new TreeNode(val);
                    return node;
                }
            }
        }
        return new TreeNode(val);
    }
}