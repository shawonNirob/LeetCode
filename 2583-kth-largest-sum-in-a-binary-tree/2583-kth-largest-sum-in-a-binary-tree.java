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
    public long kthLargestLevelSum(TreeNode root, int k){
        List<Long> level = new ArrayList();
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            long levelSum = 0;
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                levelSum += node.val;
                
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            level.add(levelSum);
        }
        
        level.sort(Comparator.reverseOrder());
        
        if(k > level.size()) return -1;
        else return level.get(k-1);
    }
}