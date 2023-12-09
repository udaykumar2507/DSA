package Insertion_DeletionLL;

public class InsertTail {
    private static Node inserttail(Node head,Node element){
        if (head==null){
            return element;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=element;
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
        Node element=new Node(00000);
        head=inserttail(head,element);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
}
    
    
}
