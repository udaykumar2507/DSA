class Solution {
    public boolean isBalanced(TreeNode root) {
        if(Height(root)==-1){
            return false;
        }else{
            return true;
        }   
    }
    private int Height(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftheight=Height(root.left);
        if (leftheight==-1) return -1;
        int rightheight=Height(root.right);
        if(rightheight==-1) return -1;
        if (Math.abs(rightheight-leftheight)>1){
            return -1;
        }
        return 1+Math.max(leftheight,rightheight);
    }
}
