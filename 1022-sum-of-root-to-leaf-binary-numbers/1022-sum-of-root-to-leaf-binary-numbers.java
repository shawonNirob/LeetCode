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
    public int sumRootToLeaf(TreeNode root) {
        int totalSum=0, currSum=0;
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root, 0));
        
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> curr = stack.pop();
            root = curr.getKey();
            currSum = curr.getValue();
            
            if(root!=null){
                currSum = currSum*2 + root.val;
                if(root.left==null && root.right==null){
                    totalSum += currSum;
                }else{
                    stack.push(new Pair(root.right, currSum));
                    stack.push(new Pair(root.left, currSum));
                }
            }
            
        }
        return totalSum;
    }
}