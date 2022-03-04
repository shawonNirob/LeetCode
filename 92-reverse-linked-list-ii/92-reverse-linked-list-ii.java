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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        if(left==right) return head;
        
        ListNode prev=null;
        ListNode curr=head;
        ListNode end=null;
        ListNode rightNode=head;
        while(left>1){
            prev=curr;
            curr=curr.next;
            left--;
            right--;
        }
        ListNode connection = prev;
        ListNode tail = curr;
        
        while(right>0){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            right--;
        }
        
        if(connection !=null){
            connection.next=prev;
        }else{
            head=prev;
        }
        tail.next=curr;
        
        return head;
    }
};