class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>anslist=new ArrayList<>();
        if (root==null){
            return anslist;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            ArrayList<Integer>sublist=new ArrayList<>();
            int size=queue.size();
            for (int i=0;i<size;i++){
                if (queue.peek().left!=null) queue.offer(queue.peek().left);
                if (queue.peek().right!=null) queue.offer(queue.peek().right);
                if (flag){
                    sublist.add(queue.poll().val);
                }else{
                    sublist.add(0,queue.poll().val);
                }
            }
            flag=!flag;
            anslist.add(sublist);

        }
        return anslist;
        
    }
}
