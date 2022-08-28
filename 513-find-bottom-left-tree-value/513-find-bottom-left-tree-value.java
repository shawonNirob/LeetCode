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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        TreeNode node = root;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                root = queue.poll();
                if(root.left != null) queue.add(root.left);
                if(root.right != null) queue.add(root.right);
                if(i==0) node = root;
            }
        }
        return node.val;
    }
}