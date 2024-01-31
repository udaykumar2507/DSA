public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast){
                return findlength(slow,fast);
            }
        }
        return 0;

        
    }
    private static int  findlength(Node slow,Node fast){
        fast=fast.next;
        int cnt=1;
        while(slow!=fast){
            fast=fast.next;
            cnt++;
        }
        return cnt;
    }
}
