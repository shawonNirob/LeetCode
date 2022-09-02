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
      public TreeNode constructFromPrePost(int[] pre, int[] post) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(new TreeNode(pre[0]));
        for (int i = 1, j = 0; i < pre.length; ++i){
            TreeNode root = new TreeNode(pre[i]);
            while (deque.getLast().val == post[j]) {
                deque.pollLast(); j++;
            }
            if (deque.getLast().left == null) deque.getLast().left = root;
            else deque.getLast().right = root;
            deque.offer(root);
        }
        return deque.getFirst();
    }
}