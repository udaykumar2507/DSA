class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || k==0){
            return head;
        }
        int cnt=1;
        ListNode tail=head;
        while(tail.next!=null){
            cnt++;
            tail=tail.next;
        }
        k%=cnt;
        if (k==cnt){
            return head;
        }
        tail.next=head;
        int val=cnt-k-1;
        ListNode temp1=head;
        while(val>0){
            temp1=temp1.next;
            val--;
        }
        head=temp1.next;
        temp1.next=null;
    return head;
    }
}
