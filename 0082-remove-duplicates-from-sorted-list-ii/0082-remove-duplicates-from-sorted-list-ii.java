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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode();
        dummy.next=head;
        head=dummy;
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr!=null && curr.next!=null){
            int data = curr.val;
            if(curr.next.val==data){
                while(curr.next!=null && curr.next.val==data){
                    prev.next=curr.next;
                    curr=curr.next;
                }
                    prev.next = curr.next;
                    curr=curr.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head.next;
    }
}