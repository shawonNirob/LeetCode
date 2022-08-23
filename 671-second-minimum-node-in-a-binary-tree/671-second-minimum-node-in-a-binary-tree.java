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
    List<Integer> list;
    public int findSecondMinimumValue(TreeNode root) {
        list = new ArrayList();
        preorder(root, root.val);
        
        Collections.sort(list);
        if(list.size()==0){
            return -1;
        }else{
            return list.get(0);
        }
    }
    private void preorder(TreeNode root, int firstMin){
        if(root==null) return;
        if(root.val != firstMin){
            list.add(root.val);
        }
        preorder(root.left, firstMin);
        preorder(root.right, firstMin);
    }
}