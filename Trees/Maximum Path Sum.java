class Solution {
    public int maxPathSum(TreeNode root) {
        int ans[]=new int [1];
        ans[0]=Integer.MIN_VALUE;
        Height(root,ans);
        return ans[0];

        
    }
    private int Height(TreeNode root,int[] ans){
        if (root==null){
            return 0;
        }
        int leftheight=Math.max(0,Height(root.left,ans));
        int rightheight=Math.max(0,Height(root.right,ans));
        ans[0]=Math.max(ans[0],leftheight+rightheight+root.val);
        return root.val+Math.max(leftheight,rightheight);

    }
}
