
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1){
            return null;
        }
        if(head.next.next==null){
            if(n==1){
                head.next=null;
                return head;
            }
            if(n==2){
                head=head.next;
                return head;
            }
        }

        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        count=count-n;
        temp=head;
        int x=0;
        while(temp!=null){
            x++;
            if(x==count||count==0){
                if(count==0){
                    temp=temp.next;
                    head=temp;
                    break;
                }
                else{
                    temp.next=temp.next.next;
                    break;
                }
            }
            
            temp=temp.next;
        }
        return head; 
    }
}