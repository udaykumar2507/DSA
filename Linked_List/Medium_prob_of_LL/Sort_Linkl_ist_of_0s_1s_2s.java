public class Solution
{
    public static Node sortList(Node head) {
        // Write your code here
        Node zerohead=new Node(-1);
        Node onehead=new Node(-1);
        Node twohead=new Node(-1);

        Node zeros=zerohead;
        Node ones=onehead;
        Node twos=twohead;

        Node temp=head;
        while(temp!=null){
            if (temp.data==0){
                zeros.next=temp;
                zeros=zeros.next;
            }
            else if (temp.data==1){
                ones.next=temp;
                ones=ones.next;
            }else{
                twos.next=temp;
                twos=twos.next;
            }
            temp=temp.next;
        }
       zeros.next=(onehead.next!=null)?(onehead.next):(twohead.next);
       ones.next=twohead.next;
       twos.next=null;
       Node newnode=zerohead.next;
       return newnode;
    }

}
