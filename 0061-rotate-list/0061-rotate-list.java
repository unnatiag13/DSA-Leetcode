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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        int n=1;
        ListNode prev = null;
        while(curr.next!=null){
            curr=curr.next;
            n++;
        }
        k=k%n;
        k=n-k;
        ListNode tail=curr;
        curr=head;
        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        tail.next=head;
        head=curr.next;
        curr.next=null;
    return head;
    }
}