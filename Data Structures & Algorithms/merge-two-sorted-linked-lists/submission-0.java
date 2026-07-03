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
        ListNode mainHead = new ListNode(0);
        ListNode head=mainHead;
        while(list1!=null||list2!=null){
            int val1=110;
            int val2=110;
            if(list1!=null){
                val1=list1.val;
            }
            if(list2!=null){
                val2=list2.val;
            }
            if(val1>val2){
                head.next=new ListNode(val2);
                head=head.next;
                list2=list2.next;
            }
            if(val1<val2){
                head.next=new ListNode(val1);
                head=head.next;
                list1=list1.next;
            }
            if(val1==val2){
                head.next=new ListNode(val1);
                head=head.next;
                list1=list1.next;
                head.next=new ListNode(val2);
                head=head.next;
                list2=list2.next;
            }
        }
        return mainHead.next;
    }
}