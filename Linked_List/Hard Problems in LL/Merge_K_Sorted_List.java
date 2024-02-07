class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i=0;i<lists.length;i++){
            if (lists[i]!=null){
            pq.add(lists[i]);
            }
        }
        ListNode dummy=new ListNode (-1);
        ListNode temp=dummy;
       while (!pq.isEmpty()) {
            ListNode p = pq.poll();
            temp.next = p;
            if (p.next != null) {
                pq.offer(p.next);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
