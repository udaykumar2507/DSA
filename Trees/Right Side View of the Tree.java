class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        int level=0;
        right(root,0,list);
        return list;
    }
    private static void right(TreeNode root,int level,List<Integer>list){
        if(root==null) return;
        if (level==list.size()) list.add(root.val);
        right(root.right,level+1,list);
        right(root.left,level+1,list);
    }
}
