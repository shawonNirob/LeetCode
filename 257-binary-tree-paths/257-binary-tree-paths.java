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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        Deque<Pair<TreeNode, String>> stack = new ArrayDeque();
        stack.push(new Pair(root, ""));
        String path = "";
        
        while(!stack.isEmpty()){
            Pair<TreeNode, String> curr = stack.pop();
            root = curr.getKey();
            path = curr.getValue();
            
            path += String.valueOf(root.val);
            if(root.left==null && root.right==null){
                list.add(path);

            }else{
                path += "->";
            }
            
            if(root.right!=null) stack.push(new Pair(root.right, path));
            if(root.left!=null) stack.push(new Pair(root.left, path));
        }
        return list;
    }
}