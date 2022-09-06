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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                root = queue.poll();
                if(level%2 == 0 && root.val%2 != 0){
                    if(i != size-1 &&  root.val >= queue.peek().val){
                        return false;
                    }
                }else if(level%2 != 0 && root.val%2 == 0){
                    if(i != size-1 &&  root.val <= queue.peek().val){
                        return false;
                    }
                }else{
                    return false;
                }
                if(root.left != null) queue.add(root.left);
                if(root.right != null) queue.add(root.right);
            }
            level++;
        }
        return true;
    }
}