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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.next==null && head.val!=val){
            return head;
        }
        while(head.next!=null && head.val==val){
            head=head.next;
        }
        if(head.val==val) return null;
        ListNode prev =head;
        ListNode curr = head.next;
        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
            }else{
                prev=curr;
            }
            curr=curr.next;
           }
        return head;
        
    }
}