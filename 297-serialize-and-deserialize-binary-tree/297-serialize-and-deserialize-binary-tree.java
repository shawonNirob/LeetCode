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
            ser += "#,";
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    int index = 0;
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return createTree(arr);
    }
    public TreeNode createTree(String[] arr){
        if(arr[index].equals("#")){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(arr[index]));
        index++;
        root.left = createTree(arr);
        root.right = createTree(arr);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));