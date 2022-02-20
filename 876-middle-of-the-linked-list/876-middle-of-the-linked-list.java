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
    public ListNode middleNode(ListNode head) {
        ListNode endNode=head;
        ListNode currentNode=head;
        while(endNode!=null && endNode.next!=null){
            endNode=endNode.next.next;
            currentNode=currentNode.next;
        }
        head =  currentNode;
        
        return head;
    }
}