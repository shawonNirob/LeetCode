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
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        
        for(int i=1; i< preorder.length; i++){
            TreeNode node = stack.peek();
            TreeNode child = new TreeNode(preorder[i]);
            
            while(!stack.isEmpty() && child.val > stack.peek().val){
                node = stack.pop();
            }
            if(child.val < node.val){
                node.left = child;
            }else{
                node.right = child;
            }
            stack.push(child);
        }
        return root;
    }
}