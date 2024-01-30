public class Solution {
	public static Node addOne(Node head) {
		// Write your code here.
		head=reverse(head);
		Node temp=head;
		int carry=1;
		while(temp!=null){
			temp.data=temp.data+carry;
			if (temp.data<10){
				carry=0;
				break;
			}else{
				temp.data=0;
				carry=1;
			}
			temp=temp.next;
		}
		if (carry==1){
			Node newnode=new Node(1);
			head=reverse(head);
			newnode.next=head;
			return newnode;
		}
		head=reverse(head);
		return head;
}
public static Node reverse(Node head){
Node prev = null;
Node current = head;
while(current != null){
Node next = current.next;
current.next = prev;
prev = current;
current = next;
}
return prev;
}
}
