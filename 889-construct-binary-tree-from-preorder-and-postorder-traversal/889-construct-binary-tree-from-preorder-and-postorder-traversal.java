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
    private int preIndex;
    private HashMap<Integer, Integer> map;
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        map = new HashMap<>();
        preIndex = 0;
        for(int i = 0; i < post.length; i++)
            map.put(post[i], i);
        return helper(pre, 0, pre.length-1);
    }
    
    private TreeNode helper(int[] pre, int left, int right) {
        if(left > right) return null;
    
        TreeNode root = new TreeNode(pre[preIndex++]);
        if(left == right) return root;
        
        int mid = map.get(pre[preIndex]);
        
        root.left = helper(pre, left, mid);
        root.right = helper(pre, mid+1, right-1);
        
        return root;
    }
}