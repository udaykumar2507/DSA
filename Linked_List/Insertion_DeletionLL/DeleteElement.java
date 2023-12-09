package Insertion_DeletionLL;

public class DeleteElement {
    private static Node removeEle(Node head,int el){
        if (head==null){
            return head;
        } 
        if (head.data==el){
            head=head.next;
            return head;
        } 
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if (temp.data==el){
                prev.next=prev.next.next;
                break;
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
        head=removeEle(head, 13);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
}
}
