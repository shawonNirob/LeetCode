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
    int length = 0;
    ListNode head;
    
    public Solution(ListNode head) {
        this.head = head;
        ListNode curr =head;
        while(curr!=null){
            curr = curr.next;
            length++;
        }
    }
    
    public int getRandom() {
        int pick =(int)(Math.random() * length);
        ListNode curr = head;
        for(int i =0; i <pick; i++){
            curr = curr.next;
        }
        return curr.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */