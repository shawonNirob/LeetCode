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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        int level=0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList();
            
            if(level%2!=0){
                for(int i = 0; i<n; i++){
                    TreeNode node = q.poll();
                    list.add(node.val);
                    q.add(node);
                }
            }
            
            for(int i=0; i<n; i++){
                TreeNode node = q.poll();
                if(!list.isEmpty()) node.val = list.get(n-i-1);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            level++;
        }
        return root;
    }
}