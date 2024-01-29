class Solution {
    public ListNode reverseList(ListNode head) {
       if (head==null || head.next==null){
           return head;
       }else{
           ListNode newhead=reverseList(head.next);
           ListNode front=head.next;
           front.next=head;
           head.next=null;
           return newhead;
       }
       
    }
}
