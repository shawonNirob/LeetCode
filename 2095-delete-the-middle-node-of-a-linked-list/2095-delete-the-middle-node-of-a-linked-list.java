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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode endNode=head;
        ListNode currentNode=head;
        ListNode prev=head;
    
        while(endNode!=null && endNode.next!=null){
            prev=currentNode;
            endNode=endNode.next.next;
            currentNode=currentNode.next;
        }
        if(prev!=null){
            prev.next=currentNode.next;
        }
  
        return head;
    }
}