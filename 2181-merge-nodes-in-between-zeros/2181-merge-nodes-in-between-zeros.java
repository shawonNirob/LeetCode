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
        ListNode add =head;
        ListNode prev=head;
        int sum=0;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
            if(curr.val==0){
                add.val=sum;
                if(prev.next.next!=null){
                    add.next=prev.next;
                    add=curr;
                }else{
                    add.next=null;
                }
                sum=0;
            
            }else{
                sum+=curr.val;
            }
        }
        return head;
    }
}