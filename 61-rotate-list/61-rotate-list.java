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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode curr=head;
        ListNode node=head;
        ListNode prev=null;
        int count=0;
        while(node!=null){
            prev=node;
            node=node.next;
            count++;
        }
        prev.next=head;
        int n=count-(k%count);
        
        while(n>=1){
            prev=curr;
            curr=curr.next;
            n--;
        }
        head=prev.next;
        prev.next=null;
        
        return head;
    }
}