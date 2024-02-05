import java.util.*;
public class Solution {
    public static Node flattenLinkedList(Node root) {
         if (root == null || root.next == null) 
                return root; 
            // recur for list on right \
            root.next = flattenLinkedList(root.next); 
            // now merge 
            root = mergeTwoLists(root, root.next);
            // it will be in turn merged with its left 
            return root; 
    }
    public static Node mergeTwoLists(Node a, Node b) {
        Node temp = new Node(0);
        Node res = temp;
        a.next=null; //imp
        b.next=null; //imp
        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.child = a; 
                temp = temp.child; 
                a = a.child; 
            }
            else {
                temp.child = b;
                temp = temp.child; 
                b = b.child; 
            }
        }
        if(a != null) temp.child = a; 
        else temp.child = b;
        return res.child; 
    }
}
