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
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        Queue<Map.Entry<Integer, Integer>> maxq = new PriorityQueue(Map.Entry.comparingByValue(Collections.reverseOrder()));
        queue.add(root);
        
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i=0; i<size; ++i){
                TreeNode node = queue.poll();
                sum += node.val;
                
                if(node.left !=null ) queue.add(node.left);
                if(node.right !=null ) queue.add(node.right);
            }
            maxq.add(new AbstractMap.SimpleEntry<>(level, sum));
            
            level++;
        }
        Map.Entry<Integer, Integer> a = maxq.peek();
        return a.getKey();
    }
}