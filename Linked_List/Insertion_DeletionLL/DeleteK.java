package Insertion_DeletionLL;

public class DeleteK {
    private static Node removeK(Node head,int k){
        if (head==null){
            return head;
        }
        if (k==1){
            head=head.next;
            return head;
        }
        Node temp=head;
        int cnt=0;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if (cnt==k){
                prev.next=prev.next.next;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;  
    }
    private static Node Convert2LL(int []arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;                               ///TC:O(N)
     }   
     public static void main(String[] args) {
        int arr[]={13,2,3,4,5};
        Node head=Convert2LL(arr);
        head=removeK(head, 5);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
}
}
