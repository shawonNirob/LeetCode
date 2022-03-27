/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node front = head;
        Node iter = head;
        while(iter != null){
            Node copy = new Node(iter.val);
            front = iter.next;
            iter.next = copy;
            copy.next = front;
            iter = front;
        }
        
        iter = head;
        while(iter != null){
            if(iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        
        iter = head;
        Node dummy = new Node(-10001);
        Node copy =dummy;
        while(iter!=null){
            front = iter.next.next;
            copy.next = iter.next;
            iter.next = front;
            
            copy = copy.next;
            iter = iter.next;
        }
        
        return dummy.next;
    }
}