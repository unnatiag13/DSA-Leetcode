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
        ListNode dummy= new ListNode();
        // while(head.next!=null && head.val==head.next.val){
        //     head=head.next;
        //     head=head.next;
        // }
        dummy.next=head;
        head=dummy;

        ListNode prev=head;
        ListNode curr=head.next;

        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                int data =curr.val;
                while(curr.next!=null && data==curr.next.val){
                    curr=curr.next;
                }
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
            prev=curr;
            curr=curr.next;
            }
        }

        return head.next;
    }
}