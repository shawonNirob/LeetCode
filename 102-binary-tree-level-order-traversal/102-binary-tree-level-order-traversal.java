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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root == null) return list;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        
        int level = 0;
        while(!queue.isEmpty()){
            list.add(new ArrayList<Integer>());
                
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                list.get(level).add(node.val);
                
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        return list;
    }
}