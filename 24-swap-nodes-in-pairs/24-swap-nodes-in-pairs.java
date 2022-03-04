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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode prevNode = dummyNode;

        while(head!=null && head.next!=null){
            ListNode firstNode=head;
            ListNode secondNode=head.next;
            
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            
            prevNode = firstNode;
            head = firstNode.next;
        }
        return dummyNode.next;
    }
}