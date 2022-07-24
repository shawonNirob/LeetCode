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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        String path;
        preorder(root, list,"");
        
        return list;
    }
    public void preorder(TreeNode root,List<String> list, String path){
        if(root==null) return;
        path += String.valueOf(root.val);
        if(root.left!=null || root.right!=null) path += "->";
        
        if(root.left==null && root.right==null) list.add(path);
        
        if(root.left!=null) preorder(root.left, list, path);
        if(root.right!=null) preorder(root.right, list, path);
    }
}