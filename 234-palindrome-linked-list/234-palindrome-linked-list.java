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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            nums.add(curr.val);
            curr=curr.next;
        }
        //Two pointer tachnique
        int front=0;
        int back= nums.size()-1;
        while(back>front){
            if(!nums.get(front).equals(nums.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}