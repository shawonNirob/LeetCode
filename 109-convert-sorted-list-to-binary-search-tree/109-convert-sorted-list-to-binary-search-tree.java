/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        list = new ArrayList();
        linkedList(head,list);
        
        return constructTree(list, 0, list.size()-1);
    }
    private void linkedList(ListNode head, List<Integer> list){
        if(head==null) return;
        list.add(head.val);
        linkedList(head.next, list);
    }
    private TreeNode constructTree(List<Integer> list, int left,int right){
        if(left>right) return null;
        
        int index = left + (right-left)/2;
        TreeNode root = new TreeNode(list.get(index));
        
        root.left = constructTree(list, left, index-1);
        root.right = constructTree(list, index+1, right);
        
        return root;
    }
    
}