package Doubly_Linked_list;


public class DeletionHead {
    private static Node deletehead(Node head){
        if (head==null||head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    private static Node Array2DLL(int []arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=Array2DLL(arr);
        head=deletehead(head);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
}
