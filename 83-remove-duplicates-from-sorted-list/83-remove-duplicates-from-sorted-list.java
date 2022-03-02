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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode returnHead = new ListNode(-101);
        returnHead.next=head;
        ListNode prev = returnHead;
        ListNode curr=head;
        
        while(curr!=null){
            if(curr.val==prev.val){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        return returnHead.next;
    }
}