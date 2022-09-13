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
    private List<Integer> list;
    private TreeNode root;
    private int index;
    
    public BSTIterator(TreeNode root) {
        this.root = root;
        this.index = 0;
        this.list = new ArrayList();
        this.helper(root);
        
    }
    
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    
    
    public int next(){
        return list.get(index++);
    }
    
    
    public boolean hasNext() {
        if(index == list.size()){
            return false;
        }else{
            return true;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */