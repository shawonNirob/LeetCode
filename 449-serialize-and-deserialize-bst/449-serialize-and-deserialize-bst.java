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
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        List<String> list = new LinkedList<String>(Arrays.asList(data.split(",")));
        return createTree(list, -1, 10001);
    }
    public TreeNode createTree(List<String> list, int min, int max){
        if(!list.isEmpty() && min < Integer.valueOf(list.get(0)) && max > Integer.valueOf(list.get(0))){
            TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
            
            list.remove(0);
            root.left = createTree(list, min, root.val);
            root.right = createTree(list, root.val, max);
            
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