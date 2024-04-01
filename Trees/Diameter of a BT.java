class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[]=new int [1];
        Height(root,diameter);
        return diameter[0];  
    }
    private int Height(TreeNode root,int [] diameter){
        if (root==null){
            return 0;
        }
        int leftheight=Height(root.left,diameter);
        int rightheight=Height(root.right,diameter);
        diameter[0]=Math.max(diameter[0],leftheight+rightheight);
        return Math.max(leftheight,rightheight)+1;
    }
}
