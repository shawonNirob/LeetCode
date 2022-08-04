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
    public String str;
    public String tree2str(TreeNode root) {
        str = "";
        preorder(root);
        return str;
    }
    public void preorder(TreeNode root){
        if(root != null){
            str +=root.val;
            if(root.left != null || root.right != null){
                str += "(";
                preorder(root.left);
                str += ")";
                
                if(root.right != null){
                    str += "(";
                    preorder(root.right);
                    str += ")";
                }
            }
        }
    }
}