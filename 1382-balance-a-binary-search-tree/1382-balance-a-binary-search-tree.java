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
    ArrayList<Integer> list;
    public TreeNode balanceBST(TreeNode root) {
        list = new ArrayList();
        inorder(root,list);
        
        return constructTree(list, 0, list.size()-1);
    }
    private void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    private TreeNode constructTree(List<Integer> list, int left, int right){
        if(left>right) return null;
        
        int rootIndex = left + (right-left)/2;
        TreeNode root = new TreeNode(list.get(rootIndex));
        
        root.left = constructTree(list, left, rootIndex-1);
        root.right = constructTree(list, rootIndex+1, right);
        
        return root;
    }
}