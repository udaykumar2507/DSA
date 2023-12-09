package Doubly_Linked_list.Reverse_DLL;

import java.util.Stack;

class Node{
        int data;
        Node next;
        Node back;
        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
        Node(int data,Node next,Node back){
            this.data=data;
            this.next=next;
            this.back=back;
        }
    }
    
  public class BruteForce{
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
            Stack<Integer> st = new Stack<>();
            Node head=Array2DLL(arr);
            Node temp=head;
            while(temp!=null){
                st.push(temp.data);
                temp=temp.next;
            }
            temp=head;
            while(temp!=null){
                temp.data=st.pop();
                temp=temp.next;
            }
            temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }    
}

    

