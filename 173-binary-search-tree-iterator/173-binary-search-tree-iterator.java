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
class BSTIterator {
    private Stack<TreeNode> stack;;
    private TreeNode root;
    
    public BSTIterator(TreeNode root) {
        this.root = root;
        this.stack = new Stack();
        this.leftMost(root);
    }
    public void leftMost(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
    
    public int next(){
        TreeNode node = stack.pop();
        if(node.right != null){
            leftMost(node.right);
        }
        return node.val;
    }
    
    
    public boolean hasNext() {
        if(!stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */