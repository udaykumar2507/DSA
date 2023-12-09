public class LengthofLL {
    private static Node Convert2LL(int []arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head; 
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            Node head=Convert2LL(arr);
            int cnt=0;
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
                cnt++;
            }
            System.out.println();
            System.out.println("The length is "+cnt);
        }

    
}
