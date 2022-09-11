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
    public int index;
    public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList();
        helper(root, list);
        Collections.sort(list);
        index = 0;
        recover(root, list);
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
    public void recover(TreeNode root, List<Integer> list){
        if(root==null) return;
        
        recover(root.left, list);
        if(root.val != list.get(index)){
            root.val = list.get(index);
        }
        index += 1;
        recover(root.right, list);
    }
}