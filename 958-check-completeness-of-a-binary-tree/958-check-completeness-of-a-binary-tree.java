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
            int size = queue.size();
            for(int i=0; i<size; i++){
                root = queue.poll();
                if(root == null){
                    while(!queue.isEmpty()){
                        root = queue.poll();
                        if(root != null){
                            ans = false;
                        }
                    }
                }else{
                    queue.add(root.left);
                    queue.add(root.right);
                }
            }
        }
        return ans;
    }
}