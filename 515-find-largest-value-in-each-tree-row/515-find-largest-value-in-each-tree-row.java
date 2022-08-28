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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        int maxVal = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                root = queue.poll();
                if(root.val > maxVal) maxVal = root.val;
                if(root.left != null) queue.add(root.left);
                if(root.right != null) queue.add(root.right);
            }
            list.add(maxVal);
            maxVal = Integer.MIN_VALUE;
        }
        return list;
    }
}