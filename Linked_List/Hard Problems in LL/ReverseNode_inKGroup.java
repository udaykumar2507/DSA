class Solution {
    public ListNode ReverseKgroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kthnode=findKthNode(temp,k);
            if (kthnode==null){
                if (prevNode!=null){
                    prevNode.next=temp;
                    break;
                }
            }
            ListNode nextNode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if (temp==head){
                head=kthnode;
            }else{
                prevNode.next=kthnode;
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
        
    }
     public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    private static ListNode findKthNode(ListNode temp,int k){
        k-=1;
        while(k>0 && temp!=null){
            temp=temp.next;
            k--;
        }
        return temp;
    }
}