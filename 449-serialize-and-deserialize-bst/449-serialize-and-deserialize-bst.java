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
        Deque<Integer> deque = new ArrayDeque();
        for(String s: data.split(",")){
            deque.add(Integer.parseInt(s));
        }
        return createTree(deque, -1, 10001);
    }
    public TreeNode createTree(Deque<Integer> deque, int min, int max){
        if(!deque.isEmpty() && min < deque.getLast()  && max >deque.getLast() ){
            TreeNode root = new TreeNode(deque.getLast());
            
            deque.removeLast();
            root.right = createTree(deque, root.val, max);
            root.left = createTree(deque, min, root.val);
            
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