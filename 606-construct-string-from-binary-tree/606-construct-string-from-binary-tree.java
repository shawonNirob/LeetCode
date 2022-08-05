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
    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();
        Stack<TreeNode> stack = new Stack();
        Set<TreeNode> isVisited = new HashSet();
        stack.push(root);
        
        while(!stack.isEmpty()){
            root = stack.peek();
                if(isVisited.contains(root)){
                    stack.pop();
                    str.append(")");
                }else{
                    isVisited.add(root);
                    str.append("(" + root.val);
                    if(root.left == null && root.right != null){
                       str.append("()");
                    }
                    if(root.right != null) stack.push(root.right);
                    if(root.left != null) stack.push(root.left);
                }
        }
        
        return str.substring(1, str.length() -1);
    }
}