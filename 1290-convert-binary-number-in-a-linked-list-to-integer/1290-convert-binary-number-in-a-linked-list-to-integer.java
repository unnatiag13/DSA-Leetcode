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
    public int getDecimalValue(ListNode head) {
        ListNode curr =head;
        int n=0;
        while(curr.next!=null){
            curr = curr.next;
            n++;
        }
        curr=head;
        int ans=0;
        while(curr!=null){
            ans += Math.pow(2,n)*curr.val;
            curr=curr.next;
            n--;
        }
        return ans;
    }
}