package Doubly_Linked_list;

public class InsertionIn_KthPos {
    private static Node InsertHead(Node head,int val){
        Node newhead=new Node(val,head,null);
        head.back=newhead;
        return newhead;
    }
    private static Node Insertinkth(Node head,int k,int val){
        if (k==1){
            return InsertHead(head, val); 
        }
        Node temp=head;
        int cnt=0;
        while(temp.next!=null){
            cnt++;
            if (cnt==k){
                break;
            }
            else{
                temp=temp.next;
            }
        }
        Node prev=temp.back;
       
        Node newNode=new Node(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
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
        head=Insertinkth(head,6,99);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    
}
    
}
