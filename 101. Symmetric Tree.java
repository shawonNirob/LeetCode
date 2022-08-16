class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }
    private boolean check(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        return (check(root1.left, root2.right) && check(root1.right, root2.left));
    } 
}

//
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode root1 = q.poll();
            TreeNode root2 = q.poll();
            if(root1 == null && root2 == null) continue;
            if(root1 == null || root2 == null) return false;
            if(root1.val != root2.val) return false;
            
            q.add(root1.left);
            q.add(root2.right);
            q.add(root1.right);
            q.add(root2.left);
        }
        return true;
    }
}
//
