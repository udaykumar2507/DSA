class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> mpp=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp.val);
            mpp.put(temp,newnode);
            temp=temp.next;
        }        
        temp=head;
        while(temp!=null){
            Node copynode=mpp.get(temp);
            copynode.next=mpp.get(temp.next);
            copynode.random=mpp.get(temp.random);
            temp=temp.next;
        }
        return mpp.get(head);
    }
}
