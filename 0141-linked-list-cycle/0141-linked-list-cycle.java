/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        if(head==null) return false;

        ListNode currf = head.next;
       
        while(curr.next!=null && currf.next!=null && currf.next.next!=null){
            if(curr==currf || curr==currf.next || curr==currf.next.next){
                return true;
            }
            curr=curr.next;
            currf=currf.next.next;
        }
        return false;
    }
}