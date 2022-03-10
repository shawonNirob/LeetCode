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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        
        int count=-1;
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        
        curr = head;
        double sum = 0;
        while(curr!=null){
            sum += (curr.val * Math.pow(2,count));
            curr = curr.next;
            count--;
        }
        int decimal = (int) sum;
        return decimal;
    }
}