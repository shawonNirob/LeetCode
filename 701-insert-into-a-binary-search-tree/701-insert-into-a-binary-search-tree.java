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
        TreeNode rootNode = root;
        if(root==null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        while(root != null){
            if(val > root.val){
                if(root.right != null){
                    root = root.right;
                }else{
                    TreeNode node = new TreeNode(val);
                    root.right = node;
                    break;
                }
            }else{
                if(root.left != null){
                    root = root.left;
                }else{
                    TreeNode node = new TreeNode(val);
                    root.left = node;
                    break;
                }
            }
        }
        return rootNode;
    }
}