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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode node=head;
        while(node!=null){
            nums.add(node.val);
            node=node.next;
        }
        Stack<Integer> numsStack = new Stack<>();
        int [] output =new int[nums.size()];
        for(int i=0; i< nums.size(); i++){
            while (!numsStack.isEmpty() && nums.get(numsStack.peek()) < nums.get(i)){
                output[numsStack.pop()] = nums.get(i);
            }
            numsStack.push(i);
        }
        return output;
    }
}