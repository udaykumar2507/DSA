package Insertion_DeletionLL;


public class Deletetail {
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
     private static void RemoveTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            if (temp.next.next==null){
                temp.next=null;
                return;
            }else{
                temp=temp.next;
            }
        }
     }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=Convert2LL(arr);
        RemoveTail(head);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

     }
    
}
