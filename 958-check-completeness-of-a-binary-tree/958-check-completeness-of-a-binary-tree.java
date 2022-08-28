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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        boolean ans = true;
        while(!queue.isEmpty()){
                root = queue.poll();
                if(root == null){
                    break;
                }else{
                    queue.add(root.left);
                    queue.add(root.right);
                }
            }
        while(!queue.isEmpty()){
            root = queue.poll();
            if(root != null){
                return false;
            }
        }
        return true;
    }
}