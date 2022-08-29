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
    private int size;
    public TreeNode increasingBST(TreeNode root){
        List<Integer> list = new ArrayList();
        helper(root, list);
        size = list.size();
        
        return BST(list, 0);
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
    private TreeNode BST(List<Integer> list, int index){
        if(index==size) return null;
        TreeNode root = new TreeNode(list.get(index));
        index += 1;
        root.right = BST(list, index);
        
        return root;
    }
}