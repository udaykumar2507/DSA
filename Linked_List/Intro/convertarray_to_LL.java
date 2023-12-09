class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class convertarray_to_LL {
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
    System.out.println(head.data);

 }
}
