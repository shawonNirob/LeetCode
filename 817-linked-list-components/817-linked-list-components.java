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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int number = 0;
        while(head!=null){
            if(set.contains(head.val) && (head.next == null || !set.contains(head.next.val))){
                number++;
            }
            head = head.next;
        }
        
        return number;
    }
}