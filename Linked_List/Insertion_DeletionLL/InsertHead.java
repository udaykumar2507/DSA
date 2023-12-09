package Insertion_DeletionLL;

public class InsertHead {
    private static Node inserthead(Node head,Node temp){
        temp.next=head;
        head=temp;
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
        Node element=new Node(555);
        head=inserthead(head,element);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
}
    
}
