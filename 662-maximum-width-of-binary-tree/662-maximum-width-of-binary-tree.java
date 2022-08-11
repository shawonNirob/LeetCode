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
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList();
        queue.addFirst(new Pair<>(root, 1));
        
        while(!queue.isEmpty()){
            Pair<TreeNode, Integer> node = queue.getLast();
            int size = queue.size();
            int first = node.getValue();
            int index=0;

            for(int i=0; i<size; i++){
                node = queue.removeLast();
                root = node.getKey();
                index = node.getValue();

                if(root.left != null) queue.addFirst(new Pair<>(root.left, 2*index-1));
                if(root.right != null) queue.addFirst(new Pair<>(root.right, 2*index));
            }
            maxWidth = Math.max(maxWidth, index-first+1);
        }
        return maxWidth;
    }
}