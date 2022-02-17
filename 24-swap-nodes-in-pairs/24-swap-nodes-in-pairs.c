/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* swapPairs(struct ListNode* head){
    if(head==NULL){
        return head;
    }
    struct ListNode* curr = head;
    struct ListNode* nex= NULL;
    struct ListNode* prev = NULL;

    int count=0;
    while(curr!= NULL && count<2){
        nex=curr->next;
        curr->next = prev;
        prev = curr;
        curr = nex;
        count++;
    }
    if(head != NULL){
        head->next = swapPairs(nex);
    }
    return prev;
}