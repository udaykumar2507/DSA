class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
} 
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        Queue<Pair>queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            int size=queue.size();
            int min=queue.peek().num;
            int first=0;
            int last=0;
            for (int i=0;i<size;i++){
                int curr_ind=queue.peek().num;
                TreeNode node=queue.peek().node;
                queue.poll();
                if (i==0){
                    first=curr_ind;
                }if (i==size-1){
                    last=curr_ind;
                }
                if (node.left!=null){
                    queue.offer(new Pair(node.left,curr_ind*2+1));
                }
                if (node.right!=null){
                    queue.offer(new Pair(node.right,curr_ind*2+2));
                }
            }
            ans=Math.max(last-first+1,ans);
        }
        return ans;
    }
}
