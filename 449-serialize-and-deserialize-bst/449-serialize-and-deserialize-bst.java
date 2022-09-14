/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    int index;
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        index = 0;
        return createTree(arr, -1, 10001);
    }
    public TreeNode createTree(String[] arr, int min, int max){
        if(index < arr.length && min < Integer.valueOf(arr[index]) && max > Integer.valueOf(arr[index])){
            TreeNode root = new TreeNode(Integer.valueOf(arr[index++]));
            
            root.left = createTree(arr, min, root.val);
            root.right = createTree(arr, root.val, max);
            
            return root;
        }else{           
            return null;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;