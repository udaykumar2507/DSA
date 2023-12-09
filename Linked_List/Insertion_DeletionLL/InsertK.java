package Insertion_DeletionLL;

public class InsertK {
    private static Node insertk(Node head,Node element,int k){
        if (head==null){
            return element;
        }
        if (k==1){
            Node temp=new Node(element.data,head);
            return temp;
        }
        Node temp=head;
        int cnt=0;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if (cnt==k){
                element.next=prev.next;
                prev.next=element;
            }
            prev=temp;
            temp=temp.next;
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
        int arr[]={1,2,4,5};
        Node head=Convert2LL(arr);
        Node element=new Node(3);
        head=insertk(head,element,4);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
}
    
}

    
