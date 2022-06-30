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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size= queue.size();

            boolean sibling = false;
            boolean cousin = false;
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(node==null){
                    sibling = false;
                    continue;
                }
                if(node.val == x || node.val == y){
                    if(sibling==true) return false;
                    sibling= true;
                    if(cousin==true) return true;
                    cousin=true;
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                
                queue.add(null);
            }
        }
        return false;
    }
}