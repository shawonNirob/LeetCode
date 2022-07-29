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
class Solution{
    public Stack<TreeNode> stack = new Stack();
    public Stack<Integer> lowLimits = new Stack();
    public Stack<Integer> highLimits = new Stack();
    
    public void update(TreeNode root, Integer low, Integer high){
        stack.push(root);
        lowLimits.push(low);
        highLimits.push(high);
    }
    
    public boolean isValidBST(TreeNode root) {    
        if(root==null) return true;
        Integer low=null, high=null;
        update(root,low,high);
        
        while(!stack.isEmpty()){
            root = stack.pop();
            low = lowLimits.pop();
            high = highLimits.pop();
            
            if((low != null && root.val <= low) || (high != null && root.val >= high)) return false;
            if(root.right != null) update(root.right, root.val, high);
            if(root.left != null) update(root.left, low, root.val);
        }
        return true;
    }
}