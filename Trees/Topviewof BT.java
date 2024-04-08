class Pair {
    Node node;
    int value;

    Pair(Node n, int v) {
        node = n;
        value = v;
    }
}

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer>list=new ArrayList<>();
        if (root==null) return list;
        Map<Integer,Integer>mpp=new TreeMap<>();
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair val=queue.remove();
            int ind=val.value;
            Node temp=val.node;
            if (mpp.get(ind)==null) mpp.put(ind,temp.data);
            if (temp.left!=null){
                queue.add(new Pair(temp.left,ind-1));
            }
            if (temp.right!=null){
                queue.add(new Pair(temp.right,ind+1));
            }
        }
        for (Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            list.add(entry.getValue());
        }
        return list;
        
    }
}
