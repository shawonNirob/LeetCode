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
    public ListNode partition(ListNode head, int x) {
        ListNode afterHead  = new ListNode(0);
        ListNode after = afterHead;
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        
        while(head!=null){
            if(head.val < x ){
                before.next = head;
                before = before.next;
            }else{
                after.next  = head;
                after = after.next;
            }
            head=head.next;
        }
        
        before.next = afterHead.next;
        after.next = null;
        
        return beforeHead.next;
    }
}