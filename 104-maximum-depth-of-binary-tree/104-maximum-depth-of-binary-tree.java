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
    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> depths = new LinkedList<>();
        
        int depth=0, currentDepth = 0;
        stack.add(root);
        depths.add(1);
        while(!stack.isEmpty()){
            root = stack.pollLast();
            currentDepth = depths.pollLast();
            
            if(root!=null){
                depth = Math.max(depth, currentDepth);
                stack.add(root.left);
                stack.add(root.right);
                depths.add(currentDepth+1);
                depths.add(currentDepth+1);
            }
        }
        return depth;
    }
}