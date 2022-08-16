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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode root1 = q.poll();
            TreeNode root2 = q.poll();
            if(root1 == null && root2 == null) continue;
            if(root1 == null || root2 == null) return false;
            if(root1.val != root2.val) return false;
            
            q.add(root1.left);
            q.add(root2.right);
            q.add(root1.right);
            q.add(root2.left);
        }
        return true;
    }
}