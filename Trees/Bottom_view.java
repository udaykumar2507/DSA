class Pair{
    Node node;
    int val;
    Pair(Node node,int val){
        this.node=node;
        this.val=val;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer>list=new ArrayList<>();
        Map<Integer,Integer>mpp=new TreeMap<>();
        Queue <Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair pair=queue.remove();
            int ind=pair.val;
            Node temp=pair.node;
            mpp.put(ind,temp.data);
            if(temp.left!=null){
                queue.add(new Pair(temp.left,ind-1));
            }
            if (temp.right!=null){
                queue.add(new Pair(temp.right,ind+1));
            }
        }
        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
