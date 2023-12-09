package Doubly_Linked_list.Reverse_DLL;

public class Optimal {
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
            Node curr=head;
            Node last=null;
            while(curr!=null){
                last=curr.back;
                curr.back=curr.next;
                curr.next=last;
                curr=curr.back;
            }
            head=last.back;
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        
    }
    
}
