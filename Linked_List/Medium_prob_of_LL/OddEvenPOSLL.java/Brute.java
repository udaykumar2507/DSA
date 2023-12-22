
import java.util.ArrayList;
public class Brute {
     int val;
   Brute next;
    Brute() {}
    Brute(int val) { this.val= val; }
    Brute(int val, Brute next) { this.val =val; this.next = next; }
  }
 class Solution{
    public Brute oddEvenList(Brute head) {
        if (head==null || head.next==null){
            return head;
        }
        ArrayList<Integer>list=new ArrayList<>();
        Brute temp=head;
        while(temp!=null && temp.next!=null){
            list.add(temp.val);
            temp=temp.next.next;
        }
        if (temp!=null){
            list.add(temp.val);
        }
        Brute temp1=head.next;
        while(temp1!=null && temp1.next!=null){
            list.add(temp1.val);
            temp1=temp1.next.next;
        }
        if (temp1!=null){
            list.add(temp1.val);
        }
        System.out.print(list);
        Brute temp2=head;
        int i=0;
        while(temp2!=null){
            temp2.val=list.get(i);
            temp2=temp2.next;
            i++;
        }
        return head;
    }
}


