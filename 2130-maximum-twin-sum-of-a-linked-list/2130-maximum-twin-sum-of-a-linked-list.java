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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode curr = slow;
        ListNode prev = null;
        while(curr!=null){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        
        curr = head;
        int twinSum = 0;
        while(prev!=null){
            if(prev.val + curr.val > twinSum){
                twinSum = prev.val + curr.val;
            }
            prev = prev.next;
            curr = curr.next;
        }
        
        return twinSum;
    }
}