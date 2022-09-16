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
    public TreeNode deleteNode(TreeNode root, int key){
        if(root==null) return null;
        else if(root.val == key){
            if(root.left==null && root.right==null){
                return null;
            }else if(root.right == null){
                root.val = predecessor(root.left);
                root.left = deleteNode(root.left, root.val);
            }else{
                root.val = successor(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else{
            root.right = deleteNode(root.right, key);
        }
        
        return root;
    }
    public int predecessor(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root.val;
    }
    public int successor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root.val;
    }
}