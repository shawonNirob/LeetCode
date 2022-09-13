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
    public String serialize(TreeNode root) {
        //String ser = "";
        //helper(root, ser);
        return helper(root, "");
    }
    public String helper(TreeNode root, String ser){
        if(root==null){
            ser += "#,";
            return ser;
        }
        ser += String.valueOf(root.val) + ",";
        ser = helper(root.left, ser);
        ser = helper(root.right, ser);
        
        return ser;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> list = new LinkedList<String>(Arrays.asList(arr));
        return createTree(list);
    }
    public TreeNode createTree(List<String> list){
        if(list.get(0).equals("#")){
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = createTree(list);
        root.right = createTree(list);
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));