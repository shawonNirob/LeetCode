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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
     
        ListNode left=list1;
        
        int i=1;
        while(i<a){
            left = left.next;
            i++;
        }
        
        ListNode right=left.next;
        while(a<=b){
            right=right.next;
            a++;
        }
        
        left.next = list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=right;
        
        return list1;
    }
}