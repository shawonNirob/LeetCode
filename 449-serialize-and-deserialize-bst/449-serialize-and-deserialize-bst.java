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
        helper(root.left);
        helper(root.right);
        ser += String.valueOf(root.val) + ",";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        return createTree(list, -1, 10001);
    }
    public TreeNode createTree(List<String> list, int min, int max){
        if(!list.isEmpty() && min < Integer.valueOf(list.get(list.size()-1)) && max > Integer.valueOf(list.get(list.size()-1))){
            TreeNode root = new TreeNode(Integer.valueOf(list.get(list.size()-1)));
            
            list.remove(list.size()-1);
            root.right = createTree(list, root.val, max);
            root.left = createTree(list, min, root.val);
            
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