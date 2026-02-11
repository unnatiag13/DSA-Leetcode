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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int k=0;
        while(curr!=null){
            curr=curr.next;
            k++;
        } 
        if(k==n){
            head=head.next;
            return head;
        }
        k=k-n;
        ListNode prev=head;
        curr=head.next;
        for(int i=1;i<k;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next = curr.next;
        return head;


        
    }
}