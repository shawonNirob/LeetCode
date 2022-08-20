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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode damiNode =new ListNode(-101);
        ListNode head = damiNode;
        ListNode curr;
           
        while(list1 !=null && list2 != null){
                if(list1.val == list2.val){
                    curr = new ListNode(list1.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list1 = list1.next;
                    
                    curr = new ListNode(list2.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list2 = list2.next;
                }
                else if(list1.val < list2.val){
                    curr = new ListNode(list1.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list1 = list1.next;
                }else{
                    curr = new ListNode(list2.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list2 = list2.next;
                }   
            }
        
        if(list1 != null) damiNode.next = list1;
        if(list2 != null) damiNode.next = list2;
        
        return head.next;
    }
}