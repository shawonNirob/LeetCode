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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node1 =head;
        ListNode node2 =head;
       
        int count=0;
        while(node1!=null){
            node1=node1.next;
            count++;
        }
        int n=count-k;
     
        node1=head;
        int i=1;
        while(i<count){
             if(i<k){
                node1=node1.next;
            }
            if(i<=n){
                node2=node2.next;
            }
            i++;
            if(i>n && i>k){
                break;
            }
        }
        int temp = node1.val;
        node1.val=node2.val;
        node2.val=temp;
        
        return head;
    }
}