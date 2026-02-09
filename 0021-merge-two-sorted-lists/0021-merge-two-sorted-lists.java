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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return list1;
        else if(list1==null) return list2;
        else if(list2==null) return list1; 
        
        ListNode head;
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        if(list1.val<list2.val){
                head=list1;
                curr1=curr1.next;
        }
        else if(list2.val<list1.val){
                head= list2;
                curr2=curr2.next;
        }
        else{
                head = list1;
                curr1=curr1.next;
        }
        ListNode tail=head;
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                tail.next=curr1;
                curr1=curr1.next;
            }
            else if(curr2.val<curr1.val){
                tail.next= curr2;
                curr2=curr2.next;
            }
            else{
                tail.next = curr1;
                curr1=curr1.next;
            }
            tail=tail.next;
        }if(curr1==null&&curr2!=null){
            tail.next= curr2;
        }else if(curr1!=null&&curr2==null){
            tail.next=curr1;
        }
        return head;

    }
}