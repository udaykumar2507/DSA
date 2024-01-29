class Solution {
    public boolean isPalindrome(ListNode head) {
      if (head==null || head.next==null){
          return true;
      }
      ListNode slow=head;
      ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      ListNode newhead=reverse(slow.next);
      ListNode start=head;
      ListNode end=newhead;
      while(end!=null){
          if (start.val!=end.val){
              reverse(newhead);
              return false;
          }else{
              start=start.next;
              end=end.next;
          }
      }
      reverse(newhead);
      return true;

    }
    private static ListNode reverse(ListNode head){
        if (head==null || head.next==null){
            return head;
        }else{
            ListNode newhead=reverse(head.next);
            ListNode front=head.next;
            front.next=head;
            head.next=null;
            return newhead;
        }
    }
}
