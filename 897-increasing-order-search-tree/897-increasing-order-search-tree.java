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
        root = new TreeNode(list.get(0)); 
        TreeNode curr = root;
        for(int i=1; i<size; i++){
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }
        return root;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}