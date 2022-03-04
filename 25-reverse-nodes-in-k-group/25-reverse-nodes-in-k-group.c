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
    public ListNode reverseKGroup(ListNode head, int k) {
            ListNode curr = head;
            ListNode nex= null;
            ListNode prev = null;
            int i=0;
            ListNode checkK=head;
            while(checkK!=null){
                checkK=checkK.next;
                    i++;
            }
            if(i<k) return head;
    
            int count=0;
            while(curr!= null && count<k){
                nex=curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
                count++;
            }
            if(head != null){
                head.next = reverseKGroup(nex, k);
            }
            return prev;
        }
}