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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ListNode prev=head;

        while(curr.next!=null){
            prev=curr;
            int sum=0; 
            curr=curr.next;
            
            while(curr.val!=0){
                sum +=curr.val;
                curr=curr.next; 
            }
            prev.val=sum;
            prev.next=curr;
        }
        if(curr.next==null){
            prev.next=null;
        }
        return head;
    }
}