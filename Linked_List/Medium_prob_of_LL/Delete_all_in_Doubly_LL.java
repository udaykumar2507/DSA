public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==k){
                if (temp==head){
                head=head.next;
                }
            Node prevnode=temp.prev;
            Node nextnode=temp.next;
            if (temp.next!=null){temp.next.prev=prevnode;}
            if (temp.prev!=null){temp.prev.next=nextnode;}
            temp=temp.next;
        }else{
            temp=temp.next;
        }
        }
        return head;
    }
}
