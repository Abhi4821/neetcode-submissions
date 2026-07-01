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
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        return rverse(pre,head); 
    }
    static ListNode rverse(ListNode pre,ListNode head){
        if(head==null){
            return pre;
        }
        ListNode front=head.next;
        head.next=pre;
        pre=head;
        head=front;
        return rverse(pre ,head);
    }

}