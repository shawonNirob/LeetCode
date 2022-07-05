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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        Stack<TreeNode[]> stack = new Stack();
        stack.push(new TreeNode[] {root1, root2});
        
        while(!stack.isEmpty()){
            TreeNode[] root = stack.pop();
            if(root[0] == null || root[1] == null) continue;
            
            root[0].val += root[1].val;
            if(root[0].left == null){
                root[0].left = root[1].left;
            }else{
                stack.push(new TreeNode[] {root[0].left, root[1].left});
            }
            if(root[0].right == null){
                root[0].right = root[1].right;
            }else{
                stack.push(new TreeNode[] {root[0].right, root[1].right});
            }
        }
        return root1;
    }
}