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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(-1001); 
        dummy.next = head;
        ListNode curr = dummy;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int pSum = 0;
        
        while(curr!=null){
             pSum+=curr.val;
            if(map.containsKey(pSum)){
                curr = map.get(pSum).next;
                int p = pSum + curr.val;
                
                while(p!=pSum){
                    map.remove(p);
                    curr = curr.next;
                    p += curr.val; 
                }
               map.get(pSum).next= curr.next;
            }else{
                map.put(pSum, curr);
            }
            curr = curr.next;
        }
        
        return dummy.next;
        
    }
}