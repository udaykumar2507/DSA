package Medium_prob_of_LL;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class Add2LL {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1); 
        Node temp = dummy; 
        int carry = 0;
        while( l1 != null || l2 != null || carry == 1) {
            int sum = 0; 
            if(l1 != null) {
                sum += l1.val; 
                l1 = l1.next; 
            }
            
            if(l2 != null) {
                sum += l2.val; 
                l2 = l2.next; 
            }
            
            sum += carry; 
            carry = sum / 10; 
            Node node = new Node(sum % 10); 
            temp.next = node; 
            temp = temp.next; 
        }
        return dummy.next;
    
}
}
