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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        TreeNode curr = root;
        TreeNode pre;
        
        while(root != null){
            if(root.left == null){
                list.add(root.val);
                root = root.right;
            }else{
                pre = root.left;
                while(pre.right != null && pre.right != root){
                    pre = pre.right;
                }
                if(pre.right == root){
                    root = root.right;
                    pre.right = null;
                }else{
                    list.add(root.val);
                    pre.right = root;
                    root = root.left;
                }
            }
        }
        return list;
    }
}