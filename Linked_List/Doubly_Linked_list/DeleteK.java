package Doubly_Linked_list;

public class DeleteK {

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
     private static Node removetail(Node head){
        if(head==null||head.next==null){
            return null;
        } 
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prev=temp.back;
        prev.next=null;
        temp.back=null;
        return head;
    }
    private static Node deletek(Node head,int k){
        Node temp=head;
        int cnt=0;
        while(temp.next!=null){
            cnt++;
            if (cnt==k){
                break;
            }
            temp=temp.next;
        }
        Node prev=temp.back;
        Node front=temp.next;
        if (prev==null && front==null){
            return head;
        }else if (prev==null){
          return deletehead(head);
        }else if (front==null){
            return removetail(head);
        }else{
            prev.next=front;
            front.back=prev;
            temp.back=null;
            temp.next=null;
        }
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
        head=deletek(head,1);
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   
    
}
