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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode =head;
    
        int length=0;
        while(currentNode != null){
            currentNode=currentNode.next;
            length++;
        }
        if(length==n){
            return head.next;
        }
        length=length-n-1;
        
        currentNode=head;
        while(length>0){
           currentNode=currentNode.next;
            length--;
        }
        currentNode.next = currentNode.next.next;
        
        return head;
    }
}