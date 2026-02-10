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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        int n=0;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        int[] arr= new int[n];
        curr=head;
        int a=0;
        while(curr!=null){
            int greater = 0;
            int currVal = curr.val;
            ListNode temp=curr.next;
            while(temp!=null){
                if(temp.val>currVal){
                    greater = temp.val;
                    break;
                }
                temp=temp.next;
            }
            arr[a++]=greater;
            curr=curr.next;
        }
        return arr;
    }
}