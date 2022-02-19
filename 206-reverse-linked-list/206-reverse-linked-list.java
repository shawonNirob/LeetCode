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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prevNode = null;
        ListNode nexNode = null;
        ListNode currentNode = head;
        
        while(currentNode!= null){
            nexNode=currentNode.next;
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nexNode;
           
        }
        return prevNode;
    }
}