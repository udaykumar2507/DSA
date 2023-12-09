package Doubly_Linked_list;

public class DeleteNode {
       private static void deleteNode(Node temp){
        Node prev=temp.back;
        Node front=temp.next;
        if(front==null){
            prev.next=null;
            temp.back=null;//Note We are not handling for head ok;
            return;
        }else{
            prev.next=front;
            front.back=prev;
            temp.next=null;
            temp.back=null;
        }

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
        deleteNode(head.next.next.next.next);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    
}
