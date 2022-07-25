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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> path = new ArrayList();
        if(root==null) return list;
        
        preorder(root,list, path,targetSum,0);
        return list;
    }
    public void preorder(TreeNode root,List<List<Integer>> list,List<Integer> path, int targetSum, int sum){
        if(root==null) return;
        sum += root.val;
        
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                list.add(new ArrayList<>(path));
            }
        }
        if(root.left!=null) preorder(root.left, list, path,targetSum, sum);
        if(root.right!=null) preorder(root.right, list, path,targetSum, sum);
        
        path.remove(path.size() -1);
    }
}